/*
 * title: ConcreteIterator.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.iteratorpattern;

/**
 * Desc: TODO
 * ClassName: ConcreteIterator
 * author: gackey
 * date: 2018-11-24 18:05
 */
class ConcreteIterator extends SelfIterator {

    private ConcreteAggregate aggregate;

    private int current = 0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public Object first() {
        return aggregate.getItem(0);
    }

    @Override
    public Object next() {
        Object ret = null;
        current++;
        if (current < aggregate.count()) {
            ret = aggregate.getItem(current);
        }
        return ret;
    }

    @Override
    public boolean beDone() {
        return current >= aggregate.count() ? true : false;
    }

    @Override
    public Object currentItem() {
        return aggregate.getItem(current);
    }

}
