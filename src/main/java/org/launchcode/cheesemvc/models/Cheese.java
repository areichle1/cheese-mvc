package org.launchcode.cheesemvc.models;

public class Cheese {
    String name;
    String description;

    public Cheese() {};

    public Cheese(String aName, String aDescription) {
        this.name = aName;
        this.description = aDescription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
