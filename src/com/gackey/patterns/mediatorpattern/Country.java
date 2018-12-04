/*
 * title: Country.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.mediatorpattern;

/**
 * @desc: 国家
 * @className: Country
 * @author: gackey
 * @date: 2018-12-04 22:16
 */
abstract class Country {
    protected UnitedNations mediator;

    public Country(UnitedNations mediator) {
        this.mediator = mediator;
    }
}
