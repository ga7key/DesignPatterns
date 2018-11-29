/*
 * title: TestPaperB.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.templatemethodpattern;

/**
 * desc: 同学乙的答案
 * className: TestPaperB
 * author: gackey
 * date: 2018-11-29 21:15
 */
class TestPaperB extends TestPaper {

    @Override
    protected String answer1() {
        return "c";
    }

    @Override
    protected String answer2() {
        return "a";
    }

    @Override
    protected String answer3() {
        return "a";
    }
}
