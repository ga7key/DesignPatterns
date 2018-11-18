/*
 * title: ConcreteBuilderTwo.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.builderpattern;

/**
 * Desc: TODO
 * ClassName: ConcreteBuilderTwo
 * author: gackey
 * date: 2018-11-18 14:03
 */
class ConcreteBuilderTwo extends Builder {

    private Product prod = new Product();

    @Override
    public void buildPartA() {
        prod.add("部件O");
    }

    @Override
    public void buildPartB() {
        prod.add("部件K");
    }

    @Override
    public Product getResult() {
        return prod;
    }

}
