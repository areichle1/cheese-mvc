package org.launchcode.cheesemvc.controllers;

import org.launchcode.cheesemvc.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute("title", "Add User");
        //@todo add user object so form model binding doesn't explode when you try to get the page for the first time.
        model.addAttribute("user", new User());
        return "user/add";
    }

    // @todo add @valid attribute along with errors object return early if validation trips or passwords don't match
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String add(Model model, @ModelAttribute @Valid User user, Errors errors, String verify_password) {
        model.addAttribute("user", user);

        if (errors.hasErrors()) {
            return "user/add";
        }

        if (user.getPassword().equals(verify_password)) {
            return "user/index";
        }

        user.setPassword("");
        model.addAttribute("error_message", "I'm sorry, but password doesn't match verify password. Please try again.");
        return "user/add";
    }
}

