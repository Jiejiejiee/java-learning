package com.learn.string.method;

import java.security.PublicKey;

public class StringMethodDemo1 {
    /*
            String类中用于比较的方法:

                public Boolean equals(Object anobject)

                 public Boolean equalsIgnoreCase(Object anobject)
     */

    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = new String("abc");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println("----------------------");

        String s3 = "ABC";

        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));//忽略大小写比较

    }

}
