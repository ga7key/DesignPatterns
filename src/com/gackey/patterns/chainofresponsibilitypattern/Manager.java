/*
 * title: Manager.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.chainofresponsibilitypattern;

/**
 * @desc: 管理者
 * @className: Manager
 * @author: gackey
 * @date: 2018-12-02 19:51
 */
abstract class Manager {

    // 当前管理者
    protected String name;
    // 当前管理者的上级
    protected Manager superior;

    public String getName() {
        return name;
    }

    // 申请请求
    public abstract void requestApplication(AskRequest request);

    public void setName(String name) {
        this.name = name;
    }

    public Manager getSuperior() {
        return superior;
    }

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

}
