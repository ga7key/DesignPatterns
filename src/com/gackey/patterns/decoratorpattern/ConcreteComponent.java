/*
 * title: ConcreteComponent.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.decoratorpattern;

/**
 * @desc: TODO
 * @className: ConcreteComponent
 * @author: gackey
 * @date: 2018-12-08 08:52
 */
class ConcreteComponent extends Component {

    @Override
    public void operation() {
        System.out.println("具体对象的操作。");
    }

}
