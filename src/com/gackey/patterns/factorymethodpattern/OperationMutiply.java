/*
 * title: OperationMutiply.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.factorymethodpattern;

/**
 * Desc: TODO
 * ClassName: OperationMutiply
 * author: gackey
 * date: 2018-11-05 22:06
 */
public class OperationMutiply extends Operation {

    @Override
    double getResult() {
        return getNumberA() * getNumberB();
    }

}
