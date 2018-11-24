/*
 * title: Aggregate.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.iteratorpattern;

/**
 * Desc: TODO
 * ClassName: Aggregate
 * author: gackey
 * date: 2018-11-24 17:58
 */
abstract class Aggregate {

    public abstract SelfIterator createIterator();
}
