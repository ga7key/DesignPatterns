/*
 * title: HandSetBrand.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.bridgepattern;

/**
 * @desc: TODO
 * @className: HandSetBrand
 * @author: gackey
 * @date: 2018-12-08 20:41
 */
abstract class HandSetBrand {

    protected HandSetSoft soft;

    public void setSoft(HandSetSoft soft) {
        this.soft = soft;
    }

    public abstract void run();
}
