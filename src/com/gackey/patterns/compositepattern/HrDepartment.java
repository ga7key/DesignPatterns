/*
 * title: HrDepartment.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.compositepattern;

/**
 * @desc: 人力资源部
 * @className: HrDepartment
 * @author: gackey
 * @date: 2018-12-06 21:24
 */
class HrDepartment extends Company {

    public HrDepartment(String name) {
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
        System.out.println(name + " → 员工招聘培训管理");
    }
}
