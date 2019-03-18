package com.forever.prototype.serializable;

import java.io.Serializable;
import java.util.List;

public class Student implements Serializable {

    private String name;
    private int age;
    private List<String> habbies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getHabbies() {
        return habbies;
    }

    public void setHabbies(List<String> habbies) {
        this.habbies = habbies;
    }
}
