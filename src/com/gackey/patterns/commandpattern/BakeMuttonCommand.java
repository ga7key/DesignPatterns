/*
 * title: BakeMuttonCommand.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.commandpattern;

/**
 * @desc: 烤羊肉串命令
 * @className: BakeMuttonCommand
 * @author: gackey
 * @date: 2018-12-01 14:31
 */
public class BakeMuttonCommand extends Command {

    public BakeMuttonCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void excuteCommand() {
        receiver.bakeMutton();
    }

    @Override
    public String toString() {
        return "羊肉串";
    }

}
