/*
 * title: ChainofResponsibilityTest.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.chainofresponsibilitypattern;

/**
 * @desc: TODO
 * @className: ChainofResponsibilityTest
 * @author: gackey
 * @date: 2018-12-02 23:19
 */
public class ChainofResponsibilityTest {

    public static void main(String[] args) {
        CommonManager jingli = new CommonManager("经理");
        MajorDomo zongjian = new MajorDomo("总监");
        GeneralManager zongjingli = new GeneralManager("总经理");
        jingli.setSuperior(zongjian);
        zongjian.setSuperior(zongjingli);

        AskRequest request = new AskRequest();
        request.setRequestType("请假");
        request.setRequestContent("小菜请假");
        request.setNumber(2);
        jingli.requestApplication(request);

        System.out.println("---------------------------");

        AskRequest request2 = new AskRequest();
        request2.setRequestType("请假");
        request2.setRequestContent("小菜请假");
        request2.setNumber(5);
        jingli.requestApplication(request2);

        System.out.println("---------------------------");

        AskRequest request3 = new AskRequest();
        request3.setRequestType("请假");
        request3.setRequestContent("小菜请假");
        request3.setNumber(20);
        jingli.requestApplication(request3);

        System.out.println("---------------------------");

        AskRequest request4 = new AskRequest();
        request4.setRequestType("请假");
        request4.setRequestContent("小菜请假");
        request4.setNumber(21);
        jingli.requestApplication(request4);

        System.out.println("---------------------------");

        AskRequest request5 = new AskRequest();
        request5.setRequestType("加薪");
        request5.setRequestContent("小菜请求加薪");
        request5.setNumber(1000);
        jingli.requestApplication(request5);

        System.out.println("---------------------------");

        AskRequest request6 = new AskRequest();
        request6.setRequestType("加薪");
        request6.setRequestContent("小菜请求加薪");
        request6.setNumber(1001);
        jingli.requestApplication(request6);
    }

}
