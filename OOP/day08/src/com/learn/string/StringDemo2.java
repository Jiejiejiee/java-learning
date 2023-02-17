package com.learn.string;

public class StringDemo2 {
    /*

        String类常见的构造方法:

            1.public String();创建一个空白字符串,里面不含任何内容
            2.public String(char[] char);根据传入的字符数组,创建字符对象
            3.public String(String original);根据传入字符串,来创建字符串对象

        ------------------------------------------------------------------------------------

            1.打印对象名,会看到对象的内存地址,TODO:这里打印字符串对象,为什么看不到地址值

            2.三个构造方法都过于繁琐,直接使用""创建方便

        ------------------------------------------------------------------------------------

        两种创建方法的区别:

                1.双引号直接创建:在String缓冲池中维护

                2.构造方法创建:在堆内存new对象中维护

     */

    public static void main(String[] args) {

        //String对象在内存中的位置
        String s1 = new String();
        System.out.println(s1);

        char[] cahr = {'a','b','c'};
        String s2 = new String(cahr);//将字符数组,转换为完整的字符串
        System.out.println(s2);

        String s3 = new String("efg");
        System.out.println(s3);

        //字符串用+拼接时,会先开辟一块String Builder空间,将+两边的字符串进行拼接,不进入String缓冲池,再用toString方法重新开辟内存存储
        String s4 = "abc";
        String s5 = "ab";
        String s6 = s5 +'c';//字符串变量

        System.out.println(s4 == s6);//flase

        //
        String s7 = "abc";
        String s8 = "a"+"b"+"c";//字符串常量,Java有常量优化机制
        System.out.println(s7 == s8);//true

    }

}
