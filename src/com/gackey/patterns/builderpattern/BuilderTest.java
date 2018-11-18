/*
 * title: BuilderTest.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.builderpattern;

/**
 * Desc: TODO
 * ClassName: BuilderTest
 * author: gackey
 * date: 2018-11-18 14:57
 */
public class BuilderTest {

    public static void main(String[] args) {
        Director director = new Director();
        Builder builderOne = new ConcreteBuilderOne();
        Builder builderTwo = new ConcreteBuilderTwo();

        director.Construct(builderOne);
        builderOne.getResult().show();

        director.Construct(builderTwo);
        builderTwo.getResult().show();
    }

}
