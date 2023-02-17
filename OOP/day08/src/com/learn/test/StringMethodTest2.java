package com.learn.test;

import java.util.Scanner;

public class StringMethodTest2 {
    /*

        键盘录入一个字符串,统计字符串中大写字母,小写字母,数字字符出现额次数

     */

    public static void main(String[] args) {

        System.out.println("请输入字符串:");

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int[] result = countString(str);

        System.out.println("该字符串有"+result[1]+"个大写字母"+result[0]+"个小写字母"+result[2]+"个数字字符");

    }

    public static int[] countString(String str){

        char[] c = str.toCharArray();
        int[] cont = {0,0,0};

        for (int i = 0; i < c.length; i++) {

//            System.out.println(c[i]);
            if (c[i] >= 'a' && c[i] <= 'z'){
                cont[0] ++;
            }else if (c[i] >= 'A' && c[i] <= 'Z'){
                cont[1] ++;
            }else if (c[i] >= '1' && c[i] <= '9'){
                cont[2] ++;
            }

        }

        return cont;

    }



}
