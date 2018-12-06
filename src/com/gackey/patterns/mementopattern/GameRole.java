/*
 * title: GameRole.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.mementopattern;

/**
 * @desc: 游戏角色
 * @className: GameRole
 * @author: gackey
 * @date: 2018-12-06 20:55
 */
class GameRole {

    private int vitality;

    private int attack;

    private int defense;

    // 获取当前角色状态
    public void stateDisplay() {
        System.out.println("角色当前状态：");
        System.out.println("体力：" + this.vitality + "  攻击力：" + this.attack + "  防御力：" + this.defense);
    }

    // 角色状态初始化
    public void getStateInstance() {
        this.vitality = 100;
        this.attack = 100;
        this.defense = 100;
    }

    // 角色失败状态
    public void fight() {
        this.vitality = 0;
        this.attack = 0;
        this.defense = 0;
    }

    // 保存角色状态
    public RoleStateMomento saveState() {
        return new RoleStateMomento(vitality, attack, defense);
    }

    public void recoveryState(RoleStateMomento momento) {
        this.vitality = momento.getVitality();
        this.attack = momento.getAttack();
        this.defense = momento.getDefense();
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
