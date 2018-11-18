/*
 * title: Product.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.builderpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Desc: TODO
 * ClassName: Product
 * author: gackey
 * date: 2018-11-18 13:50
 */
public class Product {

    List<String> parts = new ArrayList<>();

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("\n 产品 创建 ------");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
