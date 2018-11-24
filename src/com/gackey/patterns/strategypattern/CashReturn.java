/*
 * title: CashReturn.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.strategypattern;

/**
 * Desc: 返利收费子类
 * ClassName: CashReturn
 * author: gackey
 * date: 2018-11-24 13:57
 */
class CashReturn extends CashSuper {

    // 返利条件
    private double moneyCondition = 0.0;
    // 返利值
    private double moneyReturn = 0.0;

    public CashReturn() {
    }

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        if (money >= moneyCondition) {
            return (money - Math.floor(money / moneyCondition) * moneyReturn);
        } else {
            return money;
        }
    }
}
