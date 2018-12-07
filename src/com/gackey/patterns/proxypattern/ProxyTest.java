/*
 * title: ProxyTest.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.proxypattern;

/**
 * @desc: TODO
 * @className: ProxyTest
 * @author: gackey
 * @date: 2018-12-07 23:19
 */
public class ProxyTest {

    public static void main(String[] args) {
        SchoolGirl mm = new SchoolGirl();
        mm.setName("YYY");

        Proxy proxy = new Proxy(mm);
        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }
}
