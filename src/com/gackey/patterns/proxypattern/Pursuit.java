/*
 * title: Pursuit.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.proxypattern;

/**
 * @desc: TODO
 * @className: Pursuit
 * @author: gackey
 * @date: 2018-12-07 23:18
 */
class Pursuit implements GiveGift {

    SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }

    @Override
    public void giveDolls() {
        System.out.println(mm.getName() + "，送你洋娃娃！");
    }

    @Override
    public void giveFlowers() {
        System.out.println(mm.getName() + "，送你鲜花！");
    }

    @Override
    public void giveChocolate() {
        System.out.println(mm.getName() + "，送你巧克力！");
    }

}
