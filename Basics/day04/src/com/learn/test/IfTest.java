package com.learn.test;

import java.util.Scanner;

public class IfTest {
    public static void main(String[] args) {

        checkPassword();

    }

    public static void checkPassword() {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入密码：");
        int password = sc.nextInt();

        if (password == 123456) {
            System.out.println("密码正确！");
        } else {
            System.out.println("密码错误！");
        }

    }


}
