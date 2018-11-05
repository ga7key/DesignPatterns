/*
 * title: FactoryMethodTest.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.factorymethodpattern;

/**
 * Desc: TODO
 * ClassName: FactoryMethodTest
 * author: gackey
 * date: 2018-11-05 22:14
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        Ifactory factory = new AddFactory();
        Operation oper = factory.createOperation();
        oper.setNumberA(1.1);
        oper.setNumberB(5.5);
        double result = oper.getResult();
        System.out.println("结果是：" + result);
    }

}
