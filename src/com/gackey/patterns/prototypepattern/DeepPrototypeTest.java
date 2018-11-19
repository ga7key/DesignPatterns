/*
 * title: DeepPrototypeTest.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.prototypepattern;

/**
 * Desc: TODO
 * ClassName: DeepPrototypeTest
 * author: gackey
 * date: 2018-11-19 21:57
 */
public class DeepPrototypeTest {

    public static void main(String[] args) {
        Teacher t = new Teacher("kakasi", 26);
        Student s = new Student("naruto", 17, t);

        Student c = s.clone();
        System.out.println("基本数据类型的克隆，引用地址是否相等？" + (c == s));
        System.out.println(c.getName() + "-----" + c.getAge());
        System.out.println("复合数据类型的克隆，引用地址是否相等？" + (c.getT() == t));
        System.out.println(c.getT().getName() + "------" + c.getT().getAge());

        System.out.println("%-------*******--------%");

        Teacher1 teacher = new Teacher1("Itachi", 23);
        Student1 student1 = new Student1("sasuke", 17, teacher);
        Student1 co = (Student1) student1.clone();
        System.out.println("基本数据类型的克隆，引用地址是否相等？" + (co == student1));
        System.out.println(co.getName() + "---" + co.getAge());
        System.out.println("复合数据类型的克隆，引用地址是否相等？" + (co.getT() == teacher));
        System.out.println(co.getT().getName() + "----" + co.getT().getAge());
    }

}
