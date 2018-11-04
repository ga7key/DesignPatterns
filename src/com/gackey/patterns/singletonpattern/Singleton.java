/*
 * title: Singleton.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.singletonpattern;

/**
 * Desc: TODO
 * ClassName: Singleton
 * author: gackey
 * date: 2018-11-04 15:07
 */
public class Singleton {

    private static volatile Singleton instance = null;

    private Singleton() {
        if (instance != null) {
            throw new RuntimeException();
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
