/*
 * title: HungrySingleton.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.singletonpattern;

/**
 * Desc: TODO
 * ClassName: HungrySingleton
 * author: gackey
 * date: 2018-11-04 15:05
 */
public class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
