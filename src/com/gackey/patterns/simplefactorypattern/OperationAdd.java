/*
 * title: OperationAdd.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.simplefactorypattern;

/**
 * Desc: TODO
 * ClassName: OperationAdd
 * author: gackey
 * date: 2018-11-04 15:25
 */
public class OperationAdd extends Operation {

    @Override
    public double getResult() {
        return getNumberA() + getNumberB();
    }

}
