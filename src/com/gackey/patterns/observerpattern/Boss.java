/*
 * title: Boss.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Desc: 老板
 * ClassName: Boss
 * author: gackey
 * date: 2018-11-25 11:52
 */
class Boss implements Subject {

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
