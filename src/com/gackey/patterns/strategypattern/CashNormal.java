/*
 * title: CashNormal.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.strategypattern;

/**
 * Desc: 正常收费子类
 * ClassName: CashNormal
 * author: gackey
 * date: 2018-11-24 13:54
 */
class CashNormal extends CashSuper {

    @Override
    public double acceptCash(double money) {
        return money;
    }
}
