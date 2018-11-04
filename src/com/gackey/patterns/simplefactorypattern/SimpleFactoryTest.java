/*
 * title: SimpleFactoryTest.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.simplefactorypattern;

/**
 * Desc: TODO
 * ClassName: SimpleFactoryTest
 * author: gackey
 * date: 2018-11-04 15:33
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        double x = 1.1;
        double y = 8;
        String operate = "*";
        Operation oper = OperationFactory.createOperation(operate);
        oper.setNumberA(x);
        oper.setNumberB(y);
        double result = oper.getResult();
        System.out.println(x + operate + y + "的结果是：" + result);
    }
}
