package com.learn.operator;

public class OperatorDemo1 {
    public static void main(String[] args) {

        short s = 1;

        //s = s + 1;//报错，s+1强制转换为int类型，无法写回short类型

        s += 1;//扩展赋值运算符，内部自带强转效果 -> s = (short)(s + 1)

        System.out.println(s);

        double a = 22.3;
        int b = 10;
        b += a;
        System.out.println(b);

    }
}
