/*
 * title: HandSetBrandN.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.bridgepattern;

/**
 * @desc: TODO
 * @className: HandSetBrandN
 * @author: gackey
 * @date: 2018-12-08 20:43
 */
public class HandSetBrandN extends HandSetBrand {

    @Override
    public void run() {
        System.out.print("N品牌手机：");
        soft.run();
    }

}
