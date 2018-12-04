/*
 * title: Iraq.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.mediatorpattern;

/**
 * @desc: 伊拉克
 * @className: Iraq
 * @author: gackey
 * @date: 2018-12-04 22:18
 */
class Iraq extends Country {

    public Iraq(UnitedNations mediator) {
        super(mediator);
    }

    // 声明
    public void declare(String message) {
        mediator.declare(message, this);
    }

    // 获得消息
    public void getMessage(String message) {
        System.out.println("伊拉克获得安理会代传的信息：" + message);
    }
}
