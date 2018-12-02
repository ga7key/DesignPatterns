/*
 * title: MajorDomo.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.chainofresponsibilitypattern;

/**
 * @desc: 总监
 * @className: MajorDomo
 * @author: gackey
 * @date: 2018-12-02 23:09
 */
public class MajorDomo extends Manager {

    public MajorDomo(String name) {
        this.name = name;
    }

    @Override
    public void requestApplication(AskRequest request) {
        // 总监的权限是批准5天内的假期
        if (request.getRequestType().equals("请假") && request.getNumber() <= 5) {
            System.out.println(name + "：" + request.getRequestContent() + " " + request.getNumber() + "天，被批准");
        } else {
            // 其他申请交给上级处理
            if (null != superior && !superior.equals("")) {
                superior.requestApplication(request);
            }
        }
    }

}
