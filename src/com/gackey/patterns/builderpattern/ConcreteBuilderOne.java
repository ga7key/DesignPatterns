/*
 * title: ConcreteBuilderOne.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.builderpattern;

/**
 * Desc: TODO
 * ClassName: ConcreteBuilderOne
 * author: gackey
 * date: 2018-11-18 13:58
 */
class ConcreteBuilderOne extends Builder {

    private Product prod = new Product();

    @Override
    public void buildPartA() {
        prod.add("部件A");
    }

    @Override
    public void buildPartB() {
        prod.add("部件B");
    }

    @Override
    public Product getResult() {
        return prod;
    }

}
