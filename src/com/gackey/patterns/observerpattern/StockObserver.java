/*
 * title: StockObserver.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.observerpattern;

/**
 * Desc: 看股票的同事
 * ClassName: StockObserver
 * author: gackey
 * date: 2018-11-25 12:49
 */
class StockObserver extends Observer {

    public StockObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println(sub.getSubjectStatu() + " " + name + "关闭股票行情，继续工作！");
    }

}
