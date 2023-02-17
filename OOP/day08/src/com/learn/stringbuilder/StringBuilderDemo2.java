package com.learn.stringbuilder;

public class StringBuilderDemo2 {
    /*

        StringBuilder:

                1.一个可变的字符序列
                2.StringBuilder是字符串缓冲区,将其理解为容器
                                                可以存储任意数据类型,但只要进入该容器,全部变成字符串


         StringBuilder构造方法:

                 StringBuilder():创建一个空白的字符串缓冲区(容器),其初始容量为16个字符,**若超出会自动扩容
                 StringBuilder(int capacity):创建一个空白的字符串缓冲区(容器),其初始容量为capacity个字符,**若超出会自动扩容

                 StringBuilder(String str):创建一个字符串缓冲区,容器创建好后,就会带有参数的内容

     */

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("lwj");

        System.out.println(sb);

        sb.append(100);
        sb.append(45);
        sb.append(23.33);
        sb.append(false);
        sb.append('中');
        sb.append("dkjfalkf");

        System.out.println(sb);

    }

}
