/*
 * title: OperationSubtract.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.simplefactorypattern;

/**
 * Desc: TODO
 * ClassName: OperationSubtract
 * author: gackey
 * date: 2018-11-04 15:28
 */
public class OperationSubtract extends Operation {

    @Override
    public double getResult() {
        return getNumberA() - getNumberB();
    }

}
