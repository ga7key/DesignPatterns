/*
 * title: RoleStateCareTaker.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.mementopattern;

/**
 * @desc: 角色状态管理者
 * @className: RoleStateCareTaker
 * @author: gackey
 * @date: 2018-12-06 20:57
 */
class RoleStateCareTaker {

    private RoleStateMomento momento;

    public RoleStateMomento getMomento() {
        return momento;
    }

    public void setMomento(RoleStateMomento momento) {
        this.momento = momento;
    }
}
