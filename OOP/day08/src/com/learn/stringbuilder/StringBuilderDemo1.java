package com.learn.stringbuilder;

public class StringBuilderDemo1 {
    /*

        stringbuilder:提高字符串的操作效率

                1.stringbuilder的特点
                2.stringbuilder的构造方法
                3.stringbuilder常用成员方法

     */

    public static void main(String[] args) {

        long start1 = System.currentTimeMillis();//获取从1970年1月1日0分0秒到现在经历的毫秒

        String s = "";
        for (int i = 1; i <= 10000; i++) {
            s += i;
        }

        System.out.println(s);

        long end1 = System.currentTimeMillis();

        System.out.println(end1 - start1);//837,程序的运行时间


        System.out.println("-------------------------------");

        long start2 = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();

        for (int i = 1;i <= 10000;i++){
            sb.append(i);
        }

        System.out.println(sb);

        long end2 = System.currentTimeMillis();

        System.out.println(end2 - start2);//6

    }

}
