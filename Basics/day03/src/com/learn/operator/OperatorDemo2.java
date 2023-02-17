package com.learn.operator;

public class OperatorDemo2 {
    /*
            逻辑运算符：

                &
                |
                !
                ^


            短路逻辑运算符：
                &&:具有短路效果，若左边为false，右边就不执行
                ||:具有短路效果，若左边为true，右边就不执行

         -------------------------------------------------------------

         常用的逻辑运算符： &&  ||  !

                &&优先级大于||


     */
    public static void main(String[] args) {

        int x = 3;
        int y = 4;

        boolean result = ++x > 5 && y-- < 4;

        System.out.println(x);
        System.out.println(y);
        System.out.println(result);

    }
}
