/*
 * title: Observer.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.observerpattern;

/**
 * Desc: 抽象观察者
 * ClassName: Observer
 * author: gackey
 * date: 2018-11-25 21:22
 */
abstract class Observer {

    protected String name;
    protected Subject sub;

    public Observer(String name, Subject sub) {
        this.name = name;
        this.sub = sub;
    }

    public abstract void update();
}
