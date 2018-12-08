/*
 * title: Decorator.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.decoratorpattern;

/**
 * @desc: TODO
 * @className: Decorator
 * @author: gackey
 * @date: 2018-12-08 08:53
 */
class Decorator extends Component {

    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if (component != null) {
            component.operation();
        }
    }

}
