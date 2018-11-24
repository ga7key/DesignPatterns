/*
 * title: CashRebate.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.strategypattern;

/**
 * Desc: 打折收费子类
 * ClassName: CashRebate
 * author: gackey
 * date: 2018-11-24 13:56
 */
class CashRebate extends CashSuper {

    private double moneyRebate = 1.0;

    public CashRebate() {
    }

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
