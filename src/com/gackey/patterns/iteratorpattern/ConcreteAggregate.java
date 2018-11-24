/*
 * title: ConcreteAggregate.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.iteratorpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Desc: TODO
 * ClassName: ConcreteAggregate
 * author: gackey
 * date: 2018-11-24 18:10
 */
class ConcreteAggregate extends Aggregate {

    // Arrays are not supported in JDK8 seemingly --
    private List<Object> items = new ArrayList<>();

    @Override
    public SelfIterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int count() {
        return items.size();
    }

    public Object getItem(int index) {
        return items.get(index);
    }

    public void setItem(Object o) {
        items.add(o);
    }
}
