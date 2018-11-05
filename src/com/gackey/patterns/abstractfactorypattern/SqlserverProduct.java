/*
 * title: SqlserverProduct.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.abstractfactorypattern;

/**
 * Desc: TODO
 * ClassName: SqlserverProduct
 * author: gackey
 * date: 2018-11-05 22:44
 */
public class SqlserverProduct implements Iproduct {

    @Override
    public void insert(Product product) {
        System.out.println("在sql server中给产品表添加一条记录");

    }

    @Override
    public Product select(int id) {
        System.out.println("在sql server的产品表中根据id查询到一条记录");
        return null;
    }

}
