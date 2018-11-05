/*
 * title: AbstractFactoryTest.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.abstractfactorypattern;

/**
 * Desc: TODO
 * ClassName: AbstractFactoryTest
 * author: gackey
 * date: 2018-11-04 21:18
 */
public class AbstractFactoryTest {

    /**
     * Desc: TODO
     * Title: main
     * param @param args
     * return void
     * throws
     */

    public static void main(String[] args) {
        User user = new User();
        Product product = new Product();
        // mysql
        // user
        Ifactory mysqlFactory = new MysqlFactory();
        Iuser mysqlU = mysqlFactory.createUser();
        mysqlU.insert(user);
        mysqlU.select(1);
        System.out.println("**********");
        // product
        Iproduct mysqlP = mysqlFactory.createProduct();
        mysqlP.insert(product);
        mysqlP.select(3);
        System.out.println("---------------------------");
        // sql server
        // user
        Ifactory sqlserverFactory = new SqlserverFactory();
        Iuser sqlserverU = sqlserverFactory.createUser();
        sqlserverU.insert(user);
        sqlserverU.select(1);
        System.out.println("**********");
        // product
        Iproduct sqlserverP = sqlserverFactory.createProduct();
        sqlserverP.insert(product);
        sqlserverP.select(3);

    }

}
