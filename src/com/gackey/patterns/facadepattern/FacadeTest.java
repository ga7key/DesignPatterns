/*
 * title: FacadeTest.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.facadepattern;

/**
 * @desc: TODO
 * @className: FacadeTest
 * @author: gackey
 * @date: 2018-12-08 20:17
 */
public class FacadeTest {

    public static void main(String[] args) {
        Fund fund = new Fund();
        fund.buyFund();
        System.out.println("-------------------");
        fund.sellFund();
    }

}
