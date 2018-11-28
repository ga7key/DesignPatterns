/*
 * title: EventHandler.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.delegation;

import java.util.ArrayList;
import java.util.List;

/**
 * Desc: 事件处理者
 * ClassName: EventHandler
 * author: gackey
 * date: 2018-11-28 22:50
 */
class EventHandler {

    private List<Event> objects;

    public EventHandler() {
        objects = new ArrayList<>();
    }

    // 添加某个对象要执行的时间、需要的参数
    public void addEvent(Object object, String methodName, Object... args) {
        objects.add(new Event(object, methodName, args));
    }

    // 通知所有对象执行指定事件
    public void notifyX() throws Exception {
        for (Event e : objects) {
            e.invoke();
        }
    }
}
