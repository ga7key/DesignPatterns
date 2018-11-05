/*
 * title: OperationSubtract.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.factorymethodpattern;

/**
 * Desc: TODO
 * ClassName: OperationSubtract
 * author: gackey
 * date: 2018-11-05 22:04
 */
public class OperationSubtract extends Operation {

    @Override
    double getResult() {
        return getNumberA() - getNumberB();
    }

}
