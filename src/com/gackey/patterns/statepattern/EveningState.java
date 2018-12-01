/*
 * title: EveningState.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.statepattern;

/**
 * @desc: 夜晚工作状态类
 * @className: EveningState
 * @author: gackey
 * @date: 2018-12-01 21:00
 */
public class EveningState extends State {

    @Override
    public void writeProgram(Work w) {
        if (w.getHour() < 21) {
            System.out.println("当前时间：" + w.getHour() + "点 又双叒叕加班");
        } else {
            w.setCurrent(new SleepingState());
            w.writeProgram();
        }
    }

}
