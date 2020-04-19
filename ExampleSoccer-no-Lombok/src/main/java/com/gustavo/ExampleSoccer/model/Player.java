package com.gustavo.ExampleSoccer.model;

/**
 * @author Gustavo Cigaran
 * @since 15/04/2020
 * @version 1.0
 */
public class Player {
    private String name;
    private String team;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "\nName: " + this.name +
                "\nTeam: " + this.team;
    }
}
