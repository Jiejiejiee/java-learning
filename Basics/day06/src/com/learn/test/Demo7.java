package com.learn.test;

import java.util.Random;
import java.util.Scanner;

public class Demo7 {
    /*

            随机验证码的生成：

                    从36个英文字母（大小写）和0-9中，随机生成一个5位的字符串验证码并打印在控制台

     */

    public static void main(String[] args) {

//        char[] arr = {
//                'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
//                'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
//                '0','1','2','3','4','5','6','7','8','9'};

        char[] arr = new char[26 + 26 + 10];

        int index = 0;
        for (char c = 'a';c <= 'z';c++){
//            System.out.println(c);
            arr[index] = c;
            index ++;
        }

        for (char c = 'A';c <= 'Z';c++){
//            System.out.println(c);
            arr[index] = c;
            index ++;
        }

        for (char c = '0';c <= '9';c++){
//            System.out.println(c);
            arr[index] = c;
            index ++;
        }

//        System.out.println(arr);//若数组为字符类型，sout会自动遍历该数组


//        RadomDemo();

        getRadom(arr);

    }

    public static void RadomDemo(){

        String[] sArr = {"米饭","馒头","包子","麻花","面条"};

        Random r = new Random();

        //根据数组的长度，随机取出数组中的一个元素
        int i = r.nextInt(sArr.length);//0 1 2 3 4

        System.out.println(sArr[i]);

    }

    public static void getRadom(char[] array){

        Random r = new Random();

        String checkCode = "";//用一个空的字符，做字符串的拼接

        for (int i = 1; i <= 5; i++) {

            int index = r.nextInt(array.length);
//            System.out.print(array[index]);//随机取出的字符，应该拼接成一个字符串，才能方便后续的使用
            checkCode += array[index];


        }

        System.out.println(checkCode);
        System.out.println("请输入验证码：");

//        Scanner sc = new Scanner(System.in);
//        String inputcheckCode = sc.next();
//
//        if (inputcheckCode == checkCode){TODO：//字符串的匹配应该用
//
//
//
//        }

    }

}
