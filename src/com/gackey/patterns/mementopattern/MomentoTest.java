/*
 * title: MomentoTest.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.mementopattern;

/**
 * @desc: TODO
 * @className: MomentoTest
 * @author: gackey
 * @date: 2018-12-06 20:58
 */
public class MomentoTest {

    public static void main(String[] args) {
        System.out.println("----大战boss前 ------");
        GameRole naruto = new GameRole();
        naruto.getStateInstance();
        naruto.stateDisplay();

        System.out.println("<<<<<<<保存进度>>>>>>>");
        RoleStateCareTaker backup = new RoleStateCareTaker();
        backup.setMomento(naruto.saveState());

        System.out.println("-----大战boss，GG-----");
        naruto.fight();
        naruto.stateDisplay();

        System.out.println("-----恢复之前备份的状态-----");
        naruto.recoveryState(backup.getMomento());
        naruto.stateDisplay();
    }

}
