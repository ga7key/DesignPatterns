/*
 * title: ConcreteDecoratorB.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.decoratorpattern;

/**
 * @desc: TODO
 * @className: ConcreteDecoratorB
 * @author: gackey
 * @date: 2018-12-08 08:55
 */
public class ConcreteDecoratorB extends Decorator {

    @Override
    public void operation() {
        // 运行原operation()
        super.operation();
        // 本类的独有功能,相当于对Component进行装饰
        System.out.println("具体装饰对象B的操作...");
        addBehavior();
    }

    private void addBehavior() {
        System.out.println("呵呵...");
    }
}
