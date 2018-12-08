/*
 * title: FlyweightTest.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.flyweightpattern;

/**
 * @desc: TODO
 * @className: FlyweightTest
 * @author: gackey
 * @date: 2018-12-08 21:32
 */
public class FlyweightTest {

    public static void main(String[] args) {
        WebSiteFactory f = new WebSiteFactory();

        WebSite fa = f.getWebSite("产品展示");
        fa.use();
        // fb和fc共享fa创建的对象，不在实例化
        WebSite fb = f.getWebSite("产品展示");
        fb.use();
        WebSite fc = f.getWebSite("产品展示");
        fc.use();

        WebSite fd = f.getWebSite("博客");
        fd.use();
        // fe和ff共享fd创建的对象，不在实例化
        WebSite fe = f.getWebSite("博客");
        fe.use();
        WebSite ff = f.getWebSite("博客");
        ff.use();

        System.out.println("网站分类总数：" + f.getWebSiteCount());
    }

}
