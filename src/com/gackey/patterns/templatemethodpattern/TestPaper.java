/*
 * title: TestPaper.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.templatemethodpattern;

/**
 * desc: 试题
 * className: TestPaper
 * author: gackey
 * date: 2018-11-29 21:13
 */
class TestPaper {

    public void testQuestion1() {
        System.out.println("1.杨过得到，后来给了郭靖，炼成倚天剑、屠龙刀的玄铁可能是[ ] \n a.球磨铸铁 b.马口铁 c.高速合金钢 d.碳素纤维");
        System.out.println("答案：" + answer1());
    }

    protected String answer1() {
        return "";
    }

    public void testQuestion2() {
        System.out.println("2.杨过、程英、陆无双铲除了情花，造成了[ ] \n a.使这种植物不再害人 b.使一种珍稀物种灭绝 c.破坏了那个生物圈的生态平衡 d.造成该地区沙漠化");
        System.out.println("答案：" + answer2());
    }

    protected String answer2() {
        return "";
    }

    public void testQuestion3() {
        System.out.println("3.蓝凤凰致使华山师徒、桃谷六仙呕吐不止，如果你是大夫，你会给他们开什么药[ ] \n a.阿司匹林 b.牛黄解毒片 c.氟哌酸 d.让他们喝大量牛奶 e.以上都不是");
        System.out.println("答案：" + answer3());
    }

    protected String answer3() {
        return "";
    }
}
