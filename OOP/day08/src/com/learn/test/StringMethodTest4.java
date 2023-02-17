package com.learn.test;

import java.util.Scanner;

public class StringMethodTest4 {
    /*

        敏感词替换

     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入:");
        String content = sc.nextLine();

        content = content.replace("tmd", "***");//原值完全匹配

        System.out.println(content);

    }



}
