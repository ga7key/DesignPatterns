/*
 * title: DecoratorTest.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.decoratorpattern;

/**
 * @desc: TODO
 * @className: DecoratorTest
 * @author: gackey
 * @date: 2018-12-08 08:55
 */
public class DecoratorTest {

    public static void main(String[] args) {
        ConcreteComponent component = new ConcreteComponent();
        ConcreteDecoratorA cda = new ConcreteDecoratorA();
        ConcreteDecoratorB cdb = new ConcreteDecoratorB();

        cda.setComponent(component);
        cdb.setComponent(cda);
        cdb.operation();
    }

}
