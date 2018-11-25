/*
 * title: ObserverTest.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.observerpattern;

/**
 * Desc: 观察者模式
 * ClassName: ObserverTest
 * author: gackey
 * date: 2018-11-25 12:56
 */
public class ObserverTest {

    public static void main(String[] args) {
        Secretary sakura = new Secretary();
        Boss kakashi = new Boss();

        StockObserver sasuke = new StockObserver("佐助", sakura);
        NBAObserver naruto = new NBAObserver("鸣人", sakura);
        sakura.subAttach(sasuke);
        sakura.subAttach(naruto);
        sakura.setSubjectStatu("卡卡西老师来了！小樱去通知大家。");
        sakura.subNotify();

        System.out.println("------------------------");

        StockObserver sasuke2 = new StockObserver("佐助", kakashi);
        NBAObserver naruto2 = new NBAObserver("鸣人", kakashi);
        kakashi.subAttach(sasuke2);
        kakashi.subAttach(naruto2);
        // 卡卡西用神威突然出现，鸣人没有察觉到，不被通知
        kakashi.subDetach(naruto2);
        kakashi.setSubjectStatu("卡卡西用神威突然出现，大家还没有察觉。");
        kakashi.subNotify();
    }

}
