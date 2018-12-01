/*
 * title: CommandTest.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.commandpattern;

/**
 * @desc: TODO
 * @className: CommandTest
 * @author: gackey
 * @date: 2018-12-01 14:33
 */
public class CommandTest {

    public static void main(String[] args) {
        // 烧烤店营业
        Barbecuer boy = new Barbecuer();
        BakeMuttonCommand bm1 = new BakeMuttonCommand(boy);
        BakeMuttonCommand bm2 = new BakeMuttonCommand(boy);
        BakeChickenWingCommand bcw1 = new BakeChickenWingCommand(boy);
        Waiter waiter = new Waiter();

        // 顾客点餐,两打羊肉串，一打鸡翅
        waiter.addOrder(bm1);
        waiter.addOrder(bm2);
        waiter.addOrder(bcw1);
        // 取消一份羊肉串
        waiter.cancelOrder(bm2);

        // 通知后台做菜
        System.out.println("--------服务员通知厨房-----------");
        waiter.notifyExcute();
    }

}
