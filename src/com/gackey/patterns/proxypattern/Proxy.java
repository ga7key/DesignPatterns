/*
 * title: Proxy.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.proxypattern;

/**
 * @desc: TODO
 * @className: Proxy
 * @author: gackey
 * @date: 2018-12-07 23:17
 */
class Proxy implements GiveGift {

    Pursuit gg;

    public Proxy(SchoolGirl mm) {
        this.gg = new Pursuit(mm);
    }

    @Override
    public void giveDolls() {
        gg.giveDolls();
    }

    @Override
    public void giveFlowers() {
        gg.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        gg.giveChocolate();
    }

}
