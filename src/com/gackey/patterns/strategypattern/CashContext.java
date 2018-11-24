/*
 * title: CashContext.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.strategypattern;

/**
 * Desc: TODO
 * ClassName: CashContext
 * author: gackey
 * date: 2018-11-24 13:52
 */
class CashContext {

    CashSuper cs = null;

    public CashContext(String type) {
        switch (type) {
        case "正常收费":
            cs = new CashNormal();
            break;
        case "满300返100":
            cs = new CashReturn(300, 100);
            break;
        case "打8折":
            cs = new CashRebate(0.8);
            break;
        default:
            try {
                throw new Exception("type entered is invalid!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public double getResult(double money) {
        return cs.acceptCash(money);
    }
}
