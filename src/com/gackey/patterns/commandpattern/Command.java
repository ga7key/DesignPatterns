/*
 * title: Command.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.commandpattern;

/**
 * className: Command
 * author: gackey
 * date: 2018-12-01 14:23
 */
abstract class Command {

    protected Barbecuer receiver;

    public Command(Barbecuer receiver) {
        this.receiver = receiver;
    }

    public abstract void excuteCommand();
}
