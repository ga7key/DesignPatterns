/*
 * title: Teacher1.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.prototypepattern;

import java.io.Serializable;

/**
 * Desc: TODO
 * ClassName: Teacher1
 * author: gackey
 * date: 2018-11-19 21:56
 */
public class Teacher1 implements Serializable {

    private static final long serialVersionUID = 1L;

    private String Name;

    private int age;

    public Teacher1(String name, int age) {
        super();
        Name = name;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
