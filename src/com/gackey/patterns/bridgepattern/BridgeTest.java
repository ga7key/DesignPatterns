/*
 * title: BridgeTest.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.bridgepattern;

/**
 * @desc: TODO
 * @className: BridgeTest
 * @author: gackey
 * @date: 2018-12-08 20:47
 */
public class BridgeTest {

    public static void main(String[] args) {
        HandSetBrand hb = null;

        hb = new HandSetBrandN();
        hb.setSoft(new HandSetGame());
        hb.run();
        hb.setSoft(new HandSetAddressList());
        hb.run();

        System.out.println("-----------------------------");

        hb = new HandSetBrandM();
        hb.setSoft(new HandSetGame());
        hb.run();
        hb.setSoft(new HandSetAddressList());
        hb.run();
    }

}
