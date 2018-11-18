/*
 * title: Prototype.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.prototypepattern;

/**
 * Desc: 1深克隆：不仅拷贝对象，而且要将对象所引用地址的内容一块拷贝。改变一个对象的某个属性，并不影响另一个对象所引用的内容。
 *       2浅克隆：仅拷贝对象本身，并不对所引用（所指的）内容进行拷贝，当对一个对象做改变的时候，另一个对象的相应属性也做同样的改变。
 * 深克隆与浅克隆的区别在于对复合数据类型的复制
 * ClassName: Prototype
 * author: gackey
 * date: 2018-11-18 22:04
 */
public class Prototype implements Cloneable {

    private String id;

    public Prototype(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Prototype clone() {
        Prototype pt = null;
        try {
            pt = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return pt;
    }

}
