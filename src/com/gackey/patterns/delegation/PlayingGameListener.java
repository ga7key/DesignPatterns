/*
 * title: PlayingGameListener.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.delegation;

import java.util.Date;

/**
 * Desc: TODO
 * ClassName: PlayingGameListener
 * author: gackey
 * date: 2018-11-28 22:48
 */
class PlayingGameListener {

    public PlayingGameListener() {
        System.out.println(this.getClass().getSimpleName() + " 正在玩游戏,开始时间：" + new Date());
    }

    public void stopPlayingGame(Date date) {
        System.out.println(this.getClass().getSimpleName() + " 老师来了，停止玩游戏，停止时间：" + date);
    }
}
