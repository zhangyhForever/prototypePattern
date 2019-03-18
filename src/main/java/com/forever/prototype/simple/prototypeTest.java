package com.forever.prototype.simple;

import java.util.ArrayList;
import java.util.List;

public class prototypeTest {

    public static void main(String[] args) {
        ConcretePrototype s = new ConcretePrototype();
        s.setName("tom");
        s.setAge(18);
        List<String> list = new ArrayList<String>();
        s.setHobbies(list);

        ConcretePrototype clone = (ConcretePrototype)s.clone();

        System.out.println("克隆爱好地址==="+clone.getHobbies());
        System.out.println("原对象爱好地址==="+s.getHobbies());
        System.out.println(clone.getHobbies() == s.getHobbies());
    }

}
