/*
 * title: GeneralManager.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.chainofresponsibilitypattern;

/**
 * @desc: 总经理
 * @className: GeneralManager
 * @author: gackey
 * @date: 2018-12-02 23:13
 */
public class GeneralManager extends Manager {

    public GeneralManager(String name) {
        this.name = name;
    }

    @Override
    public void requestApplication(AskRequest request) {
        if (request.getRequestType().equals("请假") && request.getNumber() <= 20) {
            System.out.println(name + "：" + request.getRequestContent() + " " + request.getNumber() + "天，被批准");
        } else if (request.getRequestType().equals("加薪") && request.getNumber() <= 1000) {
            System.out.println(name + "：" + request.getRequestContent() + " " + request.getNumber() + "元，被批准");
        } else {
            System.out.println(name + "：" + request.getRequestContent() + " 还想不想干，不干就滚蛋！");
        }
    }

}
