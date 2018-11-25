/*
 * title: Subject.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.observerpattern;

/**
 * Desc: 通知者接口
 * ClassName: Subject
 * author: gackey
 * date: 2018-11-24 23:10
 */
interface Subject {

    /**
     * Desc: 添加观察者
     * Title: subAttach
     * param @param observer
     * return void
     * throws
     */
    void subAttach(Observer observer);

    /**
     * Desc: 减少观察者
     * Title: subDetach
     * param @param observer
     * return void
     * throws
     */
    void subDetach(Observer observer);

    /**
     * Desc: 通知
     * Title: subNotify
     * param 
     * return void
     * throws
     */
    void subNotify();

    /**
     * Desc: 获取通知者状态
     * Title: getSubjectStatu
     * param @return
     * return String
     * throws
     */
    String getSubjectStatu();

    /**
     * Desc: 设置通知者状态
     * Title: setSubjectStatu
     * param @param action
     * return void
     * throws
     */
    void setSubjectStatu(String action);
}
