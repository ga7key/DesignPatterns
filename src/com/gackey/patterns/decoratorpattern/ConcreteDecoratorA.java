/*
 * title: ConcreteDecoratorA.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.decoratorpattern;

/**
 * @desc: TODO
 * @className: ConcreteDecoratorA
 * @author: gackey
 * @date: 2018-12-08 08:54
 */
class ConcreteDecoratorA extends Decorator {

    private String addState;

    @Override
    public void operation() {
        // 运行原operation()
        super.operation();
        // 本类的独有功能,相当于对Component进行装饰
        addState = "new State";
        System.out.println("具体装饰对象A的操作..." + addState);
    }
}
