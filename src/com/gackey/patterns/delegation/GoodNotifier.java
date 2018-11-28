/*
 * title: GoodNotifier.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.delegation;

/**
 * Desc: 负责放哨的同学
 * ClassName: GoodNotifier
 * author: gackey
 * date: 2018-11-28 22:52
 */
public class GoodNotifier extends Notifier {

    @Override
    public void addListener(Object object, String methodName, Object... args) {
        System.out.println("有新的委托！");
        EventHandler eventHandler = this.getEventHandler();
        eventHandler.addEvent(object, methodName, args);
    }

    @Override
    public void notifyX() {
        System.out.println("放哨的同学通知委托过的同学：老师来了！");
        try {
            this.getEventHandler().notifyX();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
