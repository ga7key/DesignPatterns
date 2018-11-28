/*
 * title: DelegationTest.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.delegation;

import java.util.Date;

/**
 * Desc: TODO
 * ClassName: DelegationTest
 * author: gackey
 * date: 2018-11-28 22:54
 */
public class DelegationTest {

    public static void main(String[] args) {
        GoodNotifier goodNotifier = new GoodNotifier();

        WatchCartoonListener wcListener = new WatchCartoonListener();
        PlayingGameListener pgListener = new PlayingGameListener();
        Date date = new Date();

        goodNotifier.addListener(wcListener, "stopWatchCartoon", date);
        goodNotifier.addListener(pgListener, "stopPlayingGame", date);

        try {
            // 3秒钟后老师来了
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        goodNotifier.notifyX();
    }

}
