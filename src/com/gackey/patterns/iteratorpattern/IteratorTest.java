/*
 * title: IteratorTest.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.iteratorpattern;

/**
 * Desc: TODO
 * ClassName: IteratorTest
 * author: gackey
 * date: 2018-11-24 20:03
 */
public class IteratorTest {

    public static void main(String[] args) {

        ConcreteAggregate ca = new ConcreteAggregate();
        ca.setItem("gackey");
        ca.setItem("ninjaFrog");
        ca.setItem("Look Crazy");
        ca.setItem("Whatever Zhang");
        ca.setItem("Fault Young");
        ca.setItem(9527);

        SelfIterator si = new ConcreteIterator(ca);
        Object first = si.first();
        System.out.println("第一位的名字是：" + first);

        System.out.println("依次报出名字！");
        while (!si.beDone()) {
            System.out.println(si.currentItem());
            si.next();
        }
    }

}
