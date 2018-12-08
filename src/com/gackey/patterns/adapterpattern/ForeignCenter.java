/*
 * title: ForeignCenter.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.adapterpattern;

/**
 * @desc: 外籍中锋
 * @className: ForeignCenter
 * @author: gackey
 * @date: 2018-12-08 19:39
 */
class ForeignCenter {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void jingong() {
        System.out.println("外籍中锋：" + name + "进攻");
    }

    public void fangshou() {
        System.out.println("外籍中锋：" + name + "防守");
    }
}
