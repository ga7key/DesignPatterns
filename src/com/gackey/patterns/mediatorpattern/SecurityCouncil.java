/*
 * title: SecurityCouncil.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.mediatorpattern;

/**
 * @desc: 联合国安全理事会
 * @className: SecurityCouncil
 * @author: gackey
 * @date: 2018-12-04 22:19
 */
class SecurityCouncil extends UnitedNations {

    private UnitedStates usa;
    private Iraq iraq;

    public void setUsa(UnitedStates usa) {
        this.usa = usa;
    }

    public void setIraq(Iraq iraq) {
        this.iraq = iraq;
    }

    @Override
    public void declare(String message, Country colleague) {
        if (colleague == usa) {
            iraq.getMessage(message);
        } else {
            usa.getMessage(message);
        }
    }

}
