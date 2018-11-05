/*
 * title: DevideFactory.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.factorymethodpattern;

/**
 * Desc: TODO
 * ClassName: DevideFactory
 * author: gackey
 * date: 2018-11-05 22:11
 */
public class DevideFactory implements Ifactory {

    @Override
    public Operation createOperation() {
        return new OperationDevide();
    }

}
