/*
 * title: SqlserverFactory.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.abstractfactorypattern;

/**
 * Desc: TODO
 * ClassName: SqlserverFactory
 * author: gackey
 * date: 2018-11-04 20:28
 */
public class SqlserverFactory implements Ifactory {

    @Override
    public Iuser createUser() {
        Iuser user = new SqlserverUser();
        return user;
    }

    @Override
    public Iproduct createProduct() {
        Iproduct product = new SqlserverProduct();
        return product;
    }

}
