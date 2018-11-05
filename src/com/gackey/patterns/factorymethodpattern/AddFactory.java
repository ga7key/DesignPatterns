/*
 * title: AddFactory.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.factorymethodpattern;

/**
 * Desc: TODO
 * ClassName: AddFactory
 * author: gackey
 * date: 2018-11-05 22:09
 */
public class AddFactory implements Ifactory {

    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }

}
