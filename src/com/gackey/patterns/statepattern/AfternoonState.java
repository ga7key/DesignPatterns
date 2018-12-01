/*
 * title: AfternoonState.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.statepattern;

/**
 * @desc: 下午工作状态类
 * @className: AfternoonState
 * @author: gackey
 * @date: 2018-12-01 20:59
 */
public class AfternoonState extends State {

    @Override
    public void writeProgram(Work w) {
        if (w.getHour() < 18) {
            System.out.println("当前时间：" + w.getHour() + "点 下午状态不错，继续努力");
        } else {
            if (!w.beFinish()) {
                w.setCurrent(new EveningState());
            } else {
                w.setCurrent(new RestState());
            }
            w.writeProgram();
        }
    }

}
