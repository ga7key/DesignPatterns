/*
 * title: Director.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.builderpattern;

/**
 * Desc: TODO
 * ClassName: Director
 * author: gackey
 * date: 2018-11-18 14:51
 */
class Director {

    public void Construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }

}
