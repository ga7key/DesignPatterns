/*
 * title: NBAObserver.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.observerpattern;

/**
 * Desc: 看NBA的同事
 * ClassName: NBAObserver
 * author: gackey
 * date: 2018-11-25 12:53
 */
class NBAObserver extends Observer {

    public NBAObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println(sub.getSubjectStatu() + " " + name + "关闭NBA直播，继续工作！");
    }

}
