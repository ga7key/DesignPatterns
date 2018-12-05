/*
 * title: Scale.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.interpreterpattern;

/**
 * @desc: TODO
 * @className: Scale
 * @author: gackey
 * @date: 2018-12-05 22:19
 */
public class Scale extends Expression {

    @Override
    public void excute(String key, double value) {
        String scale = "";
        switch ((int) value) {
        case 1:
            scale = "低音";
            break;
        case 2:
            scale = "中音";
            break;
        case 3:
            scale = "高音";
            break;
        default:
            break;
        }
        System.out.print(scale + " ");
    }
}
