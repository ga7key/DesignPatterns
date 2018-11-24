/*
 * title: StrategyPatternTest.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.strategypattern;

/**
 * Desc: TODO
 * ClassName: StrategyPatternTest
 * author: gackey
 * date: 2018-11-24 13:58
 */
public class StrategyPatternTest {

    public static void main(String[] args) {
        double money = 700.50;
        String type = "打8折";

        CashContext cc = new CashContext(type);
        double result = cc.getResult(money);

        System.out.println("参与优惠后合计" + result + "元");

    }

}
