/*
 * title: Company.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.compositepattern;

/**
 * @desc: TODO
 * @className: Company
 * @author: gackey
 * @date: 2018-12-06 21:21
 */
abstract class Company {

    protected String name;

    public Company(String name) {
        this.name = name;
    }

    // 增加
    public abstract void add(Company c);

    // 删除
    public abstract void remove(Company c);

    // 展示
    public abstract void display(int depth);

    // 履行职责
    public abstract void lineofDuty();
}
