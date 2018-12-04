/*
 * title: UnitedNations.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.mediatorpattern;

/**
 * @desc: 联合国机构
 * @className: UnitedNations
 * @author: gackey
 * @date: 2018-12-04 22:16
 */
abstract class UnitedNations {

    public abstract void declare(String message, Country colleague);
}
