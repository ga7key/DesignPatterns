/*
 * title: StateTest.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.statepattern;

/**
 * @desc: 状态模式
 * @className: StateTest
 * @author: gackey
 * @date: 2018-12-01 21:21
 */
public class StateTest {

    public static void main(String[] args) {
        Work work = new Work();

        work.setHour(10);
        work.writeProgram();
        work.setHour(13);
        work.writeProgram();
        work.setHour(16);
        work.writeProgram();

        // 工作完成，正常下班
//        work.setFinish(true);
//        work.setHour(18);
//        work.writeProgram();

        work.setHour(20);
        work.writeProgram();
        work.setHour(23);
        work.writeProgram();

    }

}
