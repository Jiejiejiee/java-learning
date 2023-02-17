package com.learn.list;

import java.util.ArrayList;

public class ArrayListDemo2 {
    /*

        ArrayList中常用的成员方法:

                1.增
                        public boolean add(E e):将指定的元素追加到此列表的末尾

                        public void add(int index,E element):在此列表中的指定位置插入指定的元素。 将当前位于该位置的元素（如果有）和任何后续元素（向其索引添加一个）移动。

                2.删
                        public E remove(int index):删除该列表中指定位置的元素,*返回被删除的元素*,将任何后续元素移动到左侧（从其索引中减去一个元素）。

                        public boolean remove(Object o):根据元素做删除

                3.改
                        public E set(int index,E element):用指定的元素替换此列表中指定位置的元素

                4.查

                        public E get(int index):根据索引,返回此列表中指定位置的元素。

                        public int size()返回此列表中的元素数


     */
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

    }

    private static void queryMethod(ArrayList<String> list) {
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("沈六");

        String s = list.get(1);

        int size = list.size();

        System.out.println(size);
        System.out.println(s);
    }

    private static void updateMethod(ArrayList<String> list) {
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("沈六");

        String set = list.set(2, "赵五");

        System.out.println(set);//返回被覆盖的元素
        System.out.println(list);
    }

    private static void removeMethod(ArrayList<String> list) {
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("沈六");

        String remove = list.remove(1);

        System.out.println(remove);
        System.out.println(list);

        list.remove("王五");

        System.out.println(list);
    }

    private static void addMethod(ArrayList<String> list) {

        list.add("张三");
        list.add("李四");
        list.add("王五");//不可链式编程,返回结果为一个基本数据类型,不是对象

        list.add(0,"沈六");//注意索引越界

        System.out.println(list);
    }
}
