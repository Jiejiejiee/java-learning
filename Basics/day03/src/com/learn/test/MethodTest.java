package com.learn.test;

import java.util.Scanner;

public class MethodTest {
    public static void main(String[] args) {

        System.out.println("开始");
        getMax();
        System.out.println("结束");

    }

    public static void getMax(){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int max = a > b? a : b;

        System.out.println(max);

    }

}
