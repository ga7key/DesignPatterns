/*
 * title: MysqlUser.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.abstractfactorypattern;

/**
 * Desc: TODO
 * ClassName: MysqlUser
 * author: gackey
 * date: 2018-11-04 20:16
 */
public class MysqlUser implements Iuser {

    @Override
    public void insert(User user) {
        System.out.println("在mysql的用户表中添加一条记录");
    }

    @Override
    public User select(int id) {
        System.out.println("在mysql的用户表中根据id查询到一条数据");
        return null;
    }

}
