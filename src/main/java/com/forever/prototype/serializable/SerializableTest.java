package com.forever.prototype.serializable;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializableTest {

    public static void main(String[] args) {
        Student s = new Student();
        s.setName("zhang");
        s.setAge(18);
        List<String> habbies = new ArrayList<String>();
        habbies.add("篮球");
        habbies.add("足球");
        habbies.add("唱歌");
        s.setHabbies(habbies);

        try{
            FileOutputStream fos = new FileOutputStream("student.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s);
            oos.close();
            fos.close();

            FileInputStream fis = new FileInputStream("student.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student s1 = (Student) ois.readObject();
            ois.close();
            fis.close();

            System.out.println(s1.getName()+","+s1.getAge()+","+s1.getHabbies());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
