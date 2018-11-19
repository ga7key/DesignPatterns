/*
 * title: Student1.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.prototypepattern;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Desc: TODO
 * ClassName: Student1
 * author: gackey
 * date: 2018-11-19 21:57
 */
public class Student1 implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private Teacher1 t;

    public Student1(String name, int age, Teacher1 t) {
        super();
        this.name = name;
        this.age = age;
        this.t = t;
    }

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

    public Teacher1 getT() {
        return t;
    }

    public void setT(Teacher1 t) {
        this.t = t;
    }

    public Object clone() {
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = null;
        try {
            oo = new ObjectOutputStream(bo);
            oo.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }

        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        Object obj = null;
        try {
            ObjectInputStream oi = new ObjectInputStream(bi);
            obj = oi.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
