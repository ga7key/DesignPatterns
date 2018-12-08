/*
 * title: ConcreteWebSite.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.flyweightpattern;

/**
 * @desc: 具体网站类
 * @className: ConcreteWebSite
 * @author: gackey
 * @date: 2018-12-08 21:25
 */
class ConcreteWebSite extends WebSite {

    private String name;

    public ConcreteWebSite(String name) {
        this.name = name;
    }

    @Override
    public void use() {
        System.out.println("网站分类：" + name);
    }

}
