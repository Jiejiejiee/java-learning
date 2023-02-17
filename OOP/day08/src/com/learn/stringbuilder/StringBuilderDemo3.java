package com.learn.stringbuilder;

public class StringBuilderDemo3 {
    /*

             StringBuilder常用成员方法:

                1.public StringBuilder append(任意类型):添加数据,并返回对象自己

                2..public StringBuilder reverse():将缓冲区中的内容反转

                3.public int length():返回长度

                4..public String toString():将缓冲区的内容,以string字符串类型返回
     */
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        //链式编程:调用的方法返回值是对象,就可以继续向下调用方法
        sb.append("红色").append("绿色").append("蓝色");

        String s = sb.toString();

        System.out.println(sb);
        System.out.println(s);//将sb作为string类型输出,接下来可调用string的方法进行处理

        String[] color = s.split("色");
        for (int i = 0; i < color.length; i++) {
            System.out.println(color[i]);
        }

    }
}
