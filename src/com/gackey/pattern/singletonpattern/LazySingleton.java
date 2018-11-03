/*
 * title: LazySingleton.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.pattern.singletonpattern;

/**
 * Desc: TODO
 * ClassName: LazySingleton
 * author: gackey
 * date: 2018-11-04 00:21
 */
public class LazySingleton {

    private static volatile LazySingleton instance = null;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
