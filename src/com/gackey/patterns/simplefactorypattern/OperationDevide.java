/*
 * title: OperationDevide.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.simplefactorypattern;

/**
 * Desc: TODO
 * ClassName: OperationDevide
 * author: gackey
 * date: 2018-11-04 15:31
 */
public class OperationDevide extends Operation {

    @Override
    public double getResult() {
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
