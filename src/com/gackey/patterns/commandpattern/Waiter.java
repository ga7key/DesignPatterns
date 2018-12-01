/*
 * title: Waiter.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.commandpattern;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * @desc: 服务员类
 * @className: Waiter
 * @author: gackey
 * @date: 2018-12-01 14:32
 */
public class Waiter {

    private List<Command> orders = new ArrayList<>();

    // 新增订单
    public void addOrder(Command command) {
        if (command.getClass().getSimpleName().equals("BakeChickenWingCommand")) {
            System.out.println("服务员：烤鸡翅没有了，请点别的烧烤。");
        } else {
            orders.add(command);
            System.out.println("您有新的订单！" + command.toString() + "  时间：" + new Date());
        }
    }

    // 取消订单
    public void cancelOrder(Command command) {
        if (orders.size() > 0) {
            Iterator<Command> iterator = orders.iterator();
            while (iterator.hasNext()) {
                if (command == iterator.next()) {
                    iterator.remove();
                    System.out.println(command.toString() + " 订单被取消！" + "  时间：" + new Date());
                    return;
                }
            }
        }
    }

    // 通知执行
    public void notifyExcute() {
        for (Command cmd : orders) {
            cmd.excuteCommand();
        }
    }
}
