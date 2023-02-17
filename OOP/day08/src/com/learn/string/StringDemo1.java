package com.learn.string;

public class StringDemo1 {
    /*

        String类的特点：

                1.Java程序中所有双引号字符串，都是String类的对象

                2.字符串一旦创建,就无法更改,字符串内容不可更改

                        如果想更改,只能使用新对象,做替换

                3.string字符串虽然不可以更变,但是可以被共享

                        字符串常量池(string table):当用""创建字符串对象时,会检查常量池中是否存在该数据
                                    存在:复用
                                    不存在:创建


     */

    public static void main(String[] args) {

        //1
        String s = "abc";
         s = s.toUpperCase();//只有对象才能调用成员方法
        System.out.println(s);

        String s2 = new String();

        System.out.println("hello world".toUpperCase());

        //2
        String s3 = "abc";
        s3 = "efg";//
        System.out.println(s3);

        //3
        String s4 = "abc";
        String s5 = "abc";
        String s6 = "ab";

        System.out.println(s4 == s5);//true
        System.out.println(s4 == s6);

    }

}
