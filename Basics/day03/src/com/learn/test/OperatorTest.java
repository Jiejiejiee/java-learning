package com.learn.test;

import java.util.Scanner;

public class OperatorTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int flag = a > b? a : b;
        int max = flag > c? flag : c;

        System.out.println(max);

    }

}
