/*
 * title: Player.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.adapterpattern;

/**
 * @desc: 球员
 * @className: Player
 * @author: gackey
 * @date: 2018-12-08 19:38
 */
abstract class Player {

    protected String name;

    public Player(String name) {
        this.name = name;
    }

    public abstract void attack();

    public abstract void defense();
}
