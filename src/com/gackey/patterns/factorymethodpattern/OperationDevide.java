/*
 * title: OperationDevide.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.factorymethodpattern;

/**
 * Desc: TODO
 * ClassName: OperationDevide
 * author: gackey
 * date: 2018-11-05 22:06
 */
public class OperationDevide extends Operation {

    @Override
    double getResult() {

        double numberB = getNumberB();
        if (numberB == 0) {
            try {
                throw new Exception("除数不能为0");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return getNumberA() / numberB;
    }

}
