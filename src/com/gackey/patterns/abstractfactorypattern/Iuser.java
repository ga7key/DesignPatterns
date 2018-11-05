/*
 * title: IUser.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.abstractfactorypattern;

/**
 * Desc: TODO
 * ClassName: IUser
 * author: gackey
 * date: 2018-11-04 20:09
 */
public interface Iuser {

    void insert(User user);

    User select(int id);
}
