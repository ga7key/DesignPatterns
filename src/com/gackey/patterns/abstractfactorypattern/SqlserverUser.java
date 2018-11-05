/*
 * title: SqlserverUser.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.abstractfactorypattern;

/**
 * Desc: TODO
 * ClassName: SqlserverUser
 * author: gackey
 * date: 2018-11-04 20:13
 */
public class SqlserverUser implements Iuser {

    @Override
    public void insert(User user) {
        System.out.println("在sql server中给用户表添加一条记录");
    }

    @Override
    public User select(int id) {
        System.out.println("在sql server的用户表中根据id查询到一条记录");
        return null;
    }

}
