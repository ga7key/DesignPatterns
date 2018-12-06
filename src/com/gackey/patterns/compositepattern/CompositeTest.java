/*
 * title: CompositeTest.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.compositepattern;

/**
 * @desc: TODO
 * @className: CompositeTest
 * @author: gackey
 * @date: 2018-12-06 21:25
 */
public class CompositeTest {

    public static void main(String[] args) {
        ConcreteCompany root = new ConcreteCompany("北京总公司");
        root.add(new HrDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财政部"));

        ConcreteCompany comp = new ConcreteCompany("上海华东分公司");
        comp.add(new HrDepartment("华东分公司人力资源部"));
        comp.add(new FinanceDepartment("华东分公司财政部"));
        root.add(comp);

        ConcreteCompany comp1 = new ConcreteCompany("南京办事处");
        comp1.add(new HrDepartment("南京办事处人力资源部"));
        comp1.add(new FinanceDepartment("南京办事处财政部"));
        comp.add(comp1);

        ConcreteCompany comp2 = new ConcreteCompany("杭州办事处");
        comp2.add(new HrDepartment("杭州办事处人力资源部"));
        comp2.add(new FinanceDepartment("杭州办事处财政部"));
        comp.add(comp2);

        System.out.println("结构图：");
        root.display(0);

        System.out.println("\n 职责：");
        root.lineofDuty();
    }

}
