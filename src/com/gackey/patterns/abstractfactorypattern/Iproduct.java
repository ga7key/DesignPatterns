/*
 * title: Iproduct.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.abstractfactorypattern;

/**
 * Desc: TODO
 * ClassName: Iproduct
 * author: gackey
 * date: 2018-11-05 22:36
 */
public interface Iproduct {

    void insert(Product product);

    Product select(int id);
}
