/*
 * title: MysqlFactory.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.abstractfactorypattern;

/**
 * Desc: TODO
 * ClassName: MysqlFactory
 * author: gackey
 * date: 2018-11-04 20:21
 */
public class MysqlFactory implements Ifactory {

    @Override
    public IUser createUser() {
        IUser user = new MysqlUser();
        return user;
    }

}
