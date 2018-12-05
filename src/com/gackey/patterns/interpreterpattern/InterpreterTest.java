/*
 * title: InterpreterTest.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.interpreterpattern;

/**
 * @desc: 解释器模式
 * @className: InterpreterTest
 * @author: gackey
 * @date: 2018-12-05 22:20
 */
public class InterpreterTest {

    public static void main(String[] args) {
        PlayContent content = new PlayContent();
        System.out.println("上海滩：");
        content.setText("O 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 G 0.5 A 0.5 O 3 C 1 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3 ");
        Expression expression = null;
        try {
            while (content.getText().length() > 0) {
                String str = content.getText().substring(0, 1);
                switch (str) {
                case "O":
                    expression = new Scale();
                    break;
                case "C":
                case "D":
                case "E":
                case "F":
                case "G":
                case "A":
                case "B":
                case "P":
                    expression = new Note();
                    break;
                default:
                    break;
                }
                expression.interpret(content);
            }
        } catch (Exception e) {
            System.out.println("\n" + e.getMessage());
        }
    }

}
