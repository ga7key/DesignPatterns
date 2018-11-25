/*
 * title: Secretary.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Desc: 秘书
 * ClassName: Secretary
 * author: gackey
 * date: 2018-11-25 12:31
 */
class Secretary implements Subject {

    // 同事列表
    private List<Observer> obs = new ArrayList<>();

    private String action;

    @Override
    public void subAttach(Observer observer) {
        obs.add(observer);
    }

    @Override
    public void subDetach(Observer observer) {
        obs.remove(observer);
    }

    @Override
    public void subNotify() {
        for (Observer o : obs) {
            o.update();
        }
    }

    @Override
    public String getSubjectStatu() {
        return action;
    }

    @Override
    public void setSubjectStatu(String action) {
        this.action = action;
    }

}
