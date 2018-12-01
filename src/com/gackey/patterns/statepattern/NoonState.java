/*
 * title: NoonState.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.statepattern;

/**
 * @desc: 午休状态类
 * @className: NoonState
 * @author: gackey
 * @date: 2018-12-01 20:58
 */
public class NoonState extends State {

    @Override
    public void writeProgram(Work w) {
        if (w.getHour() < 14) {
            System.out.println("当前时间：" + w.getHour() + "点 午休时间");
        } else {
            w.setCurrent(new AfternoonState());
            w.writeProgram();
        }
    }

}
