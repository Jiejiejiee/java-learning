package com.learn.test;

import java.util.Scanner;

public class StringBuilderTest1 {
    /*

        键盘接收一个字符串,程序判断出该字符串是否为对称字符串

                12321
                01234



        String ---> StringBuilder

                        String s = "abc";
                        StringBuilder sb = new StringBUilder(s);

        StringBuilder ---> String

                        String s = sb.toString();

        字符串+""拼接相当于调用一次StringBuilder的append方法进行拼接,再用toString方法返回String类型

        ---------------------------------------------------

        StringBuilder与StringBuffer操作一致

                StringBuilder:多线程不安全
                StringBuffer:安全线程


     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String str = sc.nextLine();

        check(str);

    }

    public static void check(String str){

        StringBuilder sb = new StringBuilder(str);

        StringBuilder reverse = sb.reverse();
        String s = reverse.toString();

        System.out.println(s.equals(str));

    }

}
