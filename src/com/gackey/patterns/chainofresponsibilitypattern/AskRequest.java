/*
 * title: AskRequest.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.chainofresponsibilitypattern;

/**
 * @desc: 申请
 * @className: AskRequest
 * @author: gackey
 * @date: 2018-12-02 19:25
 */
class AskRequest {

    // 申请类别
    private String requestType;
    // 申请内容
    private String requestContent;
    // 申请数量
    private int number;

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestContent() {
        return requestContent;
    }

    public void setRequestContent(String requestContent) {
        this.requestContent = requestContent;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
