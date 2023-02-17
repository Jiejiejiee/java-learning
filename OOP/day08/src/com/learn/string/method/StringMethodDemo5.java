package com.learn.string.method;

public class StringMethodDemo5 {
    /*

            public String[] split(String regex):根据传入的字符串,作为规则,切割当前字符串

                用split切割规则时,先正常设立规则,发现未生效就尝试在规则前加 \\

     */

    public static void main(String[] args) {

        String str = "168.196.12.1";

        String[] splits = str.split("\\.");// "."表示任意字符,若实在要用.进行分割,则需要用"\\."

        for (int i = 0; i < splits.length; i++) {
            System.out.println(splits[i]);
        }

    }
}
