/*
 * title: WebSiteFactory.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.flyweightpattern;

import java.util.HashMap;

/**
 * @desc: 网站工厂
 * @className: WebSiteFactory
 * @author: gackey
 * @date: 2018-12-08 21:27
 */
class WebSiteFactory {

    private HashMap<String, ConcreteWebSite> flyweights = new HashMap<>();

    // 获取网站分类
    public WebSite getWebSite(String key) {
        if (!flyweights.containsKey(key)) {
            flyweights.put(key, new ConcreteWebSite(key));
        }
        return flyweights.get(key);
    }

    public int getWebSiteCount() {
        return flyweights.size();
    }
}
