/*
 * title: Translator.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.adapterpattern;

/**
 * @desc: 翻译
 * @className: Translator
 * @author: gackey
 * @date: 2018-12-08 19:42
 */
class Translator extends Player {

    private ForeignCenter fc = new ForeignCenter();

    public Translator(String name) {
        super(name);
        fc.setName(name);
    }

    @Override
    public void attack() {
        fc.jingong();
    }

    @Override
    public void defense() {
        fc.fangshou();
    }

}
