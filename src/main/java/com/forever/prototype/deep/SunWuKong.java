package com.forever.prototype.deep;

import java.io.*;

public class SunWuKong implements Monkey, Serializable {

    private JinGuBang jingubang;

    public SunWuKong(JinGuBang jingubang){
        this.jingubang = jingubang;
    }

    public JinGuBang getJingubang() {
        return jingubang;
    }

    public void setJingubang(JinGuBang jingubang) {
        this.jingubang = jingubang;
    }

    public Monkey deepClone() {
        SunWuKong swk = new SunWuKong(new JinGuBang());

        try{
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(swk);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            SunWuKong s = (SunWuKong) ois.readObject();

        } catch (Exception e){
            e.printStackTrace();
        }
        return swk;
    }
}
