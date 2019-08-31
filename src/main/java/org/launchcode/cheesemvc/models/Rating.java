package org.launchcode.cheesemvc.models;

public enum Rating {
    ONE (1, "*"),
    TWO (2, "**"),
    THREE (3, "***"),
    FOUR (4, "****"),
    FIVE (5, "*****");

    private final int number;
    private final String stars;

    Rating(int number, String stars) {
        this.number = number;
        this.stars = stars;
    }

    public int getNumber() {
        return number;
    }

    public String getStars() {
        return stars;
    }
}

