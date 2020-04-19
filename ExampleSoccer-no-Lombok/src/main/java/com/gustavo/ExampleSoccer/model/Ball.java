package com.gustavo.ExampleSoccer.model;

/**
 * @author Gustavo Cigaran
 * @since 15/04/2020
 * @version 1.0
 */
public class Ball {
    private String name;
    private String releaseDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "\nName: " + this.name +
                "\nRelease Date: " + this.releaseDate;
    }
}
