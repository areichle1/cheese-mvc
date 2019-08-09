package org.launchcode.cheesemvc.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CheeseController {


    @RequestMapping(value = "")
    @ResponseBody
    public String index() {
        return "My Cheese";
    }

}
