/*
 * title: HandSetBrandM.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.bridgepattern;

/**
 * @desc: TODO
 * @className: HandSetBrandM
 * @author: gackey
 * @date: 2018-12-08 20:45
 */
public class HandSetBrandM extends HandSetBrand {

    @Override
    public void run() {
        System.out.print("M品牌手机：");
        soft.run();
    }

}
