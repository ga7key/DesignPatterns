/*
 * title: RoleStateMomento.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.mementopattern;

/**
 * @desc: 角色状态存储箱
 * @className: RoleStateMomento
 * @author: gackey
 * @date: 2018-12-06 20:56
 */
class RoleStateMomento {

    private int vitality;
    private int attack;
    private int defense;

    public RoleStateMomento() {
    }

    public RoleStateMomento(int vitality, int attack, int defense) {
        this.vitality = vitality;
        this.attack = attack;
        this.defense = defense;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

}
