/*
 * title: OperationFactory.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.simplefactorypattern;

/**
 * Desc: TODO
 * ClassName: OperationFactory
 * author: gackey
 * date: 2018-11-04 15:32
 */
public class OperationFactory {

    public static Operation createOperation(String operate) {
        Operation oper = null;
        switch (operate) {
        case "+":
            oper = new OperationAdd();
            break;
        case "-":
            oper = new OperationSubtract();
            break;
        case "*":
            oper = new OperationMultiply();
            break;
        case "/":
            oper = new OperationDevide();
            break;
        default:
            try {
                throw new Exception("{}: the operator entered is not in accordance with the rules" + operate);
            } catch (Exception e) {
                e.printStackTrace();
            }
            break;
        }
        return oper;
    }
}
