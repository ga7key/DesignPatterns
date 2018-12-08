/*
 * title: AdapterTest.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.adapterpattern;

/**
 * @desc: TODO
 * @className: AdapterTest
 * @author: gackey
 * @date: 2018-12-08 19:43
 */
public class AdapterTest {

    public static void main(String[] args) {
        Player guards = new Guards("麦迪");
        Player forwards = new Forwards("巴蒂尔");
        Player center = new Translator("姚明");

        guards.attack();
        forwards.attack();
        center.attack();
        System.out.println("-----------------------");
        guards.defense();
        forwards.defense();
        center.defense();
    }

}
