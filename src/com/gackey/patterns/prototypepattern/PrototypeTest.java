/*
 * title: PrototypeTest.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.prototypepattern;

/**
 * Desc: TODO
 * ClassName: PrototypeTest
 * author: gackey
 * date: 2018-11-18 22:23
 */
public class PrototypeTest {

    public static void main(String[] args) {
        Prototype pt = new Prototype("ninjafrig");
        Prototype cl = pt.clone();

        System.out.println("基本数据类型的克隆，引用地址是否相等？" + (pt == cl));
        System.out.println(cl.getId());
    }

}
