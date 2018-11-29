/*
 * title: TestPaperA.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.templatemethodpattern;

/**
 * desc: 同学甲的答案
 * className: TestPaperA
 * author: gackey
 * date: 2018-11-29 21:14
 */
class TestPaperA extends TestPaper {

    @Override
    protected String answer1() {
        return "b";
    }

    @Override
    protected String answer2() {
        return "c";
    }

    @Override
    protected String answer3() {
        return "a";
    }
}
