package com.learn.string.method;

public class StringMethodDemo4 {
    /*

        public String replace(CharSequence target,CharSequence replacement)

                                    参数1:旧值
                                    参数2:新值

     */

    public static void main(String[] args) {

        String str = "liwenjiehaochou";

        String replace = str.replace("haochou","haoshuai");

        System.out.println(replace);

    }

}
