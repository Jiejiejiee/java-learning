package com.learn.string.method;

public class StringMethodDemo3 {
    /*

        substring(int beginIndex):根据开始索引开始截取到字符串的末尾

        substring(int beginIndex , int endIndex):根据开始和结束索引截取字符串
                                                        -包含头,不包含尾

        截取出的字符串应作为新的一个字符串,需要找变量接收


     */

    public static void main(String[] args) {

        String str = "hello world";

        String str1 = str.substring(6);
        System.out.println(str1);

        String str2 = str.substring(0,5);
        System.out.println(str2);

    }

}


