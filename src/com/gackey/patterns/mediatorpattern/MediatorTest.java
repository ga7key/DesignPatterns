/*
 * title: MediatorTest.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.mediatorpattern;

/**
 * @desc: TODO
 * @className: MediatorTest
 * @author: gackey
 * @date: 2018-12-04 22:20
 */
public class MediatorTest {

    public static void main(String[] args) {
        SecurityCouncil sc = new SecurityCouncil();

        UnitedStates usa = new UnitedStates(sc);
        Iraq iraq = new Iraq(sc);

        sc.setUsa(usa);
        sc.setIraq(iraq);

        usa.declare("不准研制核武器，否则就准备接受正义的制裁吧！");
        iraq.declare("我们没有研制核武器，来就干！问问苍天怕过谁！");
    }
}
