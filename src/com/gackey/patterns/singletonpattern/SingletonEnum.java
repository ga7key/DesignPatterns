/*
 * title: SingletonEnum.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.singletonpattern;

/**
 * Desc: TODO
 * ClassName: SingletonEnum
 * author: gackey
 * date: 2018-11-04 15:07
 */
public enum SingletonEnum {

    INSTANCE;

    public SingletonEnum getInstance() {
        return SingletonEnum.INSTANCE;
    }
}
