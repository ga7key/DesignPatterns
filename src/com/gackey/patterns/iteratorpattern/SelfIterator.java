/*
 * title: SelfIterator.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.iteratorpattern;

/**
 * Desc: TODO
 * ClassName: SelfIterator
 * author: gackey
 * date: 2018-11-24 17:50
 */
abstract class SelfIterator {

    public abstract Object first();

    public abstract Object next();

    public abstract boolean beDone();

    public abstract Object currentItem();
}
