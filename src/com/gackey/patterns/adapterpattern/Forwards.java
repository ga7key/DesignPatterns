/*
 * title: Forwards.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.adapterpattern;

/**
 * @desc: 前锋
 * @className: Forwards
 * @author: gackey
 * @date: 2018-12-08 19:40
 */
class Forwards extends Player {

    public Forwards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("前锋：" + name + "进攻");
    }

    @Override
    public void defense() {
        System.out.println("前锋：" + name + "防守");
    }

}
