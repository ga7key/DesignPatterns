/*
 * title: FinanceDepartment.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.compositepattern;

/**
 * @desc: 财务部
 * @className: FinanceDepartment
 * @author: gackey
 * @date: 2018-12-06 21:23
 */
class FinanceDepartment extends Company {

    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {
    }

    @Override
    public void remove(Company c) {
    }

    @Override
    public void display(int depth) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (i < depth) {
            sb.append("-");
            i++;
        }
        System.out.println(sb.toString() + name);
    }

    @Override
    public void lineofDuty() {
        System.out.println(name + " → 公司财务收支管理");
    }

}
