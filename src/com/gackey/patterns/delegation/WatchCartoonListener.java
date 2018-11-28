/*
 * title: WatchCartoonListener.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.delegation;

import java.util.Date;

/**
 * Desc: TODO
 * ClassName: WatchCartoonListener
 * author: gackey
 * date: 2018-11-28 22:49
 */
class WatchCartoonListener {

    public WatchCartoonListener() {
        System.out.println(this.getClass().getSimpleName() + " 正在看漫画,开始时间：" + new Date());
    }

    public void stopWatchCartoon(Date date) {
        System.out.println(this.getClass().getSimpleName() + " 老师来了，停止看漫画，停止时间：" + date);
    }
}
