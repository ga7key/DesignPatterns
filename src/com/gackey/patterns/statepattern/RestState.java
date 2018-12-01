/*
 * title: RestState.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.statepattern;

/**
 * @desc: 下班休息状态类
 * @className: RestState
 * @author: gackey
 * @date: 2018-12-01 21:02
 */
public class RestState extends State {

    @Override
    public void writeProgram(Work w) {
        System.out.println("当前时间：" + w.getHour() + "点 下班回家了");
    }

}
