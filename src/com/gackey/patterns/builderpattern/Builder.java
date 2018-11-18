/*
 * title: Builder.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.builderpattern;

/**
 * Desc: 产品
 * ClassName: Builder
 * author: gackey
 * date: 2018-11-18 13:54
 */
abstract class Builder {

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract Product getResult();
}
