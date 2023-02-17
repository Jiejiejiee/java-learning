package com.learn.test;

import java.util.ArrayList;

public class ArrayListTest1 {
    /*

        创建一个存储字符的集合,内部存储3个字符串元素,使用程序实现在控制台遍历该集合

     */

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList();

        print1(list);

        System.out.println("-------------------------");

        print2(list);

    }

    private static void print2(ArrayList<String> list) {
        list.add("西门吹雪");
        list.add("西域狂鸭");
        list.add("张三");
        list.add("珍妮玛黛妗");
        list.add("李四五");
        list.add("易烊干洗");

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.length() == 4){
                System.out.println(s);
            }
        }
    }

    private static void print1(ArrayList<String> list) {
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("沈六");

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
    }

}
