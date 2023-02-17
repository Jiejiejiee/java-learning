package com.learn.test;

import java.util.Scanner;

public class StringMethodTest3 {
    /*

        手机号码中间四位屏蔽:18827861475 -->188****1475

     */

    public static void main(String[] args) {

        //键盘录入手机号
        System.out.println("请输入您的手机号:");
        Scanner sc = new Scanner(System.in);

        String tel = sc.nextLine();

        //将手机号码传递到屏蔽方法中
        String result = replace(tel);

        //输出屏蔽后的号码
        System.out.println(result);

    }

    public static String replace(String tel){

        String tel1 = tel.substring(0, 3);
        String tel2 = tel.substring(7);

        String tell = tel1 + "****" + tel2;
        return tell;

    }

}
