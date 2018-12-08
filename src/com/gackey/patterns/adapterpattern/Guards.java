/*
 * title: Guards.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.adapterpattern;

/**
 * @desc: 后卫
 * @className: Guards
 * @author: gackey
 * @date: 2018-12-08 19:41
 */
class Guards extends Player {

    public Guards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("后卫：" + name + "进攻");
    }

    @Override
    public void defense() {
        System.out.println("后卫：" + name + "防守");
    }

}
