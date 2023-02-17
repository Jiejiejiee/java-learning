package com.learn.string.method;

public class StringMethodDemo2 {
    /*

        string类用于遍历的方法:

                char[] toCharArray()
                            将字符串转换为一个新的字符数组

                char charAT(int Index)
                            根据索引返回char值

                length()
                            返回字符串的长度

     */

    public static void main(String[] args) {

        print1();//效率更高

        print2();

    }

    private static void print1() {
        String str = "fajdnvandjkvnak";

        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }

    private static void print2() {
        String str = "asdjnvlkasnvks";

//        char c = str.charAt(2);
//        System.out.println(c);

//        for (int i = 0; i < 6; i++) {
//            System.out.println(str.charAt(i));
//        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(c);
        }
    }

}
