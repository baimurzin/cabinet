package org.itlabel.cabinet.model;

import java.util.List;

public class User {

    private String name;

    private List<String> skills;

    public String getName() {
        return name;
    }

    public String getSkills(int i) { return skills.get(i); }

    public void setName(String name) {
        this.name = name;
    }

    public void setSkills(List skills) { this.skills = skills; }
}
