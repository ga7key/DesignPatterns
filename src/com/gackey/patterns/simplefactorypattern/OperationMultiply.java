/*
 * title: OperationMultiply.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.simplefactorypattern;

/**
 * Desc: TODO
 * ClassName: OperationMultiply
 * author: gackey
 * date: 2018-11-04 15:29
 */
public class OperationMultiply extends Operation {

    @Override
    public double getResult() {
        return getNumberA() * getNumberB();
    }

}
