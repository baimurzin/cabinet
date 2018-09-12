package org.itlabel.cabinet.model;

public class User {

    private String name;

    private String[] skills;

    public String getName() {
        return name;
    }

    public String getSkills(int i) { return skills[i]; }

    public void setName(String name) {
        this.name = name;
    }

    public void setSkills(String[] skills) { this.skills = skills; }
}
