/*
 * title: Expression.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.interpreterpattern;

/**
 * @desc: TODO
 * @className: Expression
 * @author: gackey
 * @date: 2018-12-05 22:17
 */
abstract class Expression {

    // 解释器
    public void interpret(PlayContent content) {
        if (content.getText().length() == 0) {
            return;
        } else {
            // 截取key-value并将其从演奏文本中删除
            String playKey = content.getText().substring(0, 1);
            content.setText(content.getText().substring(2));
            Double playValue = Double.valueOf(content.getText().substring(0, content.getText().indexOf(" ")));
            content.setText(content.getText().substring(content.getText().indexOf(" ") + 1));

            excute(playKey, playValue);
        }
    }

    // 执行
    public abstract void excute(String key, double value);
}
