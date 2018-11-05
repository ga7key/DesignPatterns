/*
 * title: Ifactory.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.abstractfactorypattern;

/**
 * Desc: TODO
 * ClassName: Ifactory
 * author: gackey
 * date: 2018-11-04 20:18
 */
public interface Ifactory {

    Iuser createUser();

    Iproduct createProduct();
}
