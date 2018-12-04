/*
 * title: UnitedStates.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.mediatorpattern;

/**
 * @desc: 美国
 * @className: UnitedStates
 * @author: gackey
 * @date: 2018-12-04 22:18
 */
class UnitedStates extends Country {

    public UnitedStates(UnitedNations mediator) {
        super(mediator);
    }

    // 声明
    public void declare(String message) {
        mediator.declare(message, this);
    }

    // 获得消息
    public void getMessage(String message) {
        System.out.println("美国获得安理会代传的信息：" + message);
    }
}
