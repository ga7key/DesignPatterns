/*
 * title: ConcreteCompany.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.compositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @desc: TODO
 * @className: ConcreteCompany
 * @author: gackey
 * @date: 2018-12-06 21:22
 */
class ConcreteCompany extends Company {

    private List<Company> children = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {
        children.add(c);
    }

    @Override
    public void remove(Company c) {
        children.remove(c);
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
        for (Company component : children) {
            component.display(depth + 2);
        }
    }

    @Override
    public void lineofDuty() {
        for (Company component : children) {
            component.lineofDuty();
        }
    }

}
