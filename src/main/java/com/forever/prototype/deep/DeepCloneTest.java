package com.forever.prototype.deep;

public class DeepCloneTest {

    public static void main(String[] args) {
        SunWuKong s = new SunWuKong(new JinGuBang());
        SunWuKong sun = (SunWuKong)s.deepClone();

        System.out.println("克隆金箍棒地址==="+sun.getJingubang());
        System.out.println("原对象金箍棒地址==="+s.getJingubang());
        System.out.println(sun.getJingubang() == s.getJingubang());
    }
}
