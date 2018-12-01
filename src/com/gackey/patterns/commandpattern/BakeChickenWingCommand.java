/*
 * title: BakeChickenWingCommand.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.commandpattern;

/**
 * @desc: 烤鸡翅命令
 * @className: BakeChickenWingCommand
 * @author: gackey
 * @date: 2018-12-01 14:30
 */
public class BakeChickenWingCommand extends Command {

    public BakeChickenWingCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void excuteCommand() {
        receiver.bakeChickenWing();
    }

    @Override
    public String toString() {
        return "鸡翅";
    }

}
