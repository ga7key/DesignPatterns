/*
 * title: Student.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.prototypepattern;

/**
 * Desc: TODO
 * ClassName: Student
 * author: gackey
 * date: 2018-11-19 21:55
 */
public class Student implements Cloneable {

    private String name;
    private int age;
    private Teacher t;

    public Student(String name, int age, Teacher t) {
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

    public Teacher getT() {
        return t;
    }

    public void setT(Teacher t) {
        this.t = t;
    }

    @Override
    public Student clone() {
        Student s = null;
        try {
            s = (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        // 深克隆需要克隆复合数据类型
        s.setT((Teacher) s.getT().clone());
        return s;
    }
}
