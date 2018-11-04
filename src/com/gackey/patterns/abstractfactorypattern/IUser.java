/*
 * title: IUser.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.abstractfactorypattern;

import org.omg.PortableInterceptor.USER_EXCEPTION;

/**
 * Desc: TODO
 * ClassName: IUser
 * author: gackey
 * date: 2018-11-04 20:09
 */
public interface IUser {

    void insert(User user);

    User select(int id);
}
