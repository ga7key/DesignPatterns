/*
 * title: MutiplyFactory.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.factorymethodpattern;

/**
 * Desc: TODO
 * ClassName: MutiplyFactory
 * author: gackey
 * date: 2018-11-05 22:10
 */
public class MutiplyFactory implements Ifactory {

    @Override
    public Operation createOperation() {
        return new OperationMutiply();
    }

}
