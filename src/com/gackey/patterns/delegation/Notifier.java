/*
 * title: Notifier.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.delegation;

/**
 * Desc: 抽象通知者
 * ClassName: Notifier
 * author: gackey
 * date: 2018-11-28 22:51
 */
abstract class Notifier {

    private EventHandler eventHandler = new EventHandler();

    /**
     * Desc: 增加需要通知的同学
     * Title: addListener
     * @param object
     * @param methodName
     * @param args
     * return void
     * throws
     */
    public abstract void addListener(Object object, String methodName, Object... args);

    // 执行通知事件
    public abstract void notifyX();

    public EventHandler getEventHandler() {
        return eventHandler;
    }

    public void setEventHandler(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }
}
