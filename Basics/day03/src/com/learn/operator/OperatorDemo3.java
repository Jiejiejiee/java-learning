package com.learn.operator;

public class OperatorDemo3 {
    /*
            三元运算符：

                格式：
                        判断条件？ 值1 ： 值2


                执行流程：
                        1.执行判断条件，看其返回结果是true或false
                        2.true：最终结果是值1
                        3.false：最终结果是值2

     */
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        int max = num1 > num2? num1 : num2;

        System.out.println(max);

    }
}
