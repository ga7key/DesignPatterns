/*
 * title: Teacher.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.prototypepattern;

/**
 * Desc: TODO
 * ClassName: Teacher
 * author: gackey
 * date: 2018-11-19 21:54
 */
public class Teacher implements Cloneable {

    private String name;
    private int age;

    public Teacher(String name, int age) {
        super();
        this.name = name;
        this.age = age;
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

    @Override
    public Teacher clone() {
        Teacher t = null;
        try {
            t = (Teacher) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return t;
    }
}
