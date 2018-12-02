/*
 * title: CommonManager.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.chainofresponsibilitypattern;

/**
 * @desc: 经理
 * @className: CommonManager
 * @author: gackey
 * @date: 2018-12-02 20:05
 */
public class CommonManager extends Manager {

    public CommonManager(String name) {
        this.name = name;
    }

    @Override
    public void requestApplication(AskRequest request) {
        // 经理的权限是批准2天内的假期
        if (request.getRequestType().equals("请假") && request.getNumber() <= 2) {
            System.out.println(name + "：" + request.getRequestContent() + " " + request.getNumber() + "天，被批准");
        } else {
            // 其他申请交给上级处理
            if (null != superior && !superior.equals("")) {
                superior.requestApplication(request);
            }
        }
    }

}
