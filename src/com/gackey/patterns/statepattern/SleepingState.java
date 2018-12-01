/*
 * title: SleepingState.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.statepattern;

/**
 * @desc: 睡眠状态类
 * @className: SleepingState
 * @author: gackey
 * @date: 2018-12-01 21:01
 */
public class SleepingState extends State {

    @Override
    public void writeProgram(Work w) {
        System.out.println("当前时间：" + w.getHour() + "点 疲累至极，睡着了");
    }

}
