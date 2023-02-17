package com.learn.test;

import java.util.Scanner;

public class StringMethodTest1 {
    /*

        模拟用户登录需求

     */

    public static void main(String[] args) {

        String username = "admin";
        String password = "123456";

        Scanner sc = new Scanner(System.in);

        for (int i = 1;i <= 3;i++) {
            System.out.println("请输入用户名:");
            String inputusername = sc.nextLine();

            System.out.println("请输入密码:");
            String intputpassword = sc.nextLine();

            if (inputusername.equals(username) && intputpassword.equals(password)){

                System.out.println("登陆成功!");
                break;

            }else{

                if ((3-i) == 0){
                    System.out.println("登录失败,请明天再试。");
                }else{
                    System.out.println("登录失败!"+"您还剩余"+(3-i)+"次机会");
                }

            }
        }

    }

}
