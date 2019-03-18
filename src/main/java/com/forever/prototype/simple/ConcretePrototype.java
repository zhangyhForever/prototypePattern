package com.forever.prototype.simple;

import java.util.List;

public class ConcretePrototype implements Prototype{

    private String name;
    private int age;
    private List<String> hobbies;

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

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Prototype clone() {
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setName(this.name);
        prototype.setAge(this.age);
        prototype.setHobbies(this.hobbies);
        return prototype;
    }
}
