/*
 * title: TemplateMethodTest.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.templatemethodpattern;

/**
 * desc: TODO
 * className: TemplateMethodTest
 * author: gackey
 * date: 2018-11-29 21:19
 */
public class TemplateMethodTest {

    public static void main(String[] args) {
        System.out.println("***学生甲的试卷：");
        TestPaperA studentA = new TestPaperA();
        studentA.testQuestion1();
        studentA.testQuestion2();
        studentA.testQuestion3();

        System.out.println("***学生乙的试卷：");
        TestPaperB studentB = new TestPaperB();
        studentB.testQuestion1();
        studentB.testQuestion2();
        studentB.testQuestion3();
    }

}
