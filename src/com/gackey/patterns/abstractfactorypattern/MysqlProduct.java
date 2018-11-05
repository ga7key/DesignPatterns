/*
 * title: MysqlProduct.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.abstractfactorypattern;

/**
 * Desc: TODO
 * ClassName: MysqlProduct
 * author: gackey
 * date: 2018-11-05 22:40
 */
public class MysqlProduct implements Iproduct {

    @Override
    public void insert(Product product) {
        System.out.println("在mysql的产品表中添加一条记录");

    }

    @Override
    public Product select(int id) {
        System.out.println("在mysql的产品表中根据id查询到一条数据");
        return null;
    }

}
