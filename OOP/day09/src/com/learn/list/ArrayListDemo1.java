package com.learn.list;

import java.util.ArrayList;

public class ArrayListDemo1 {
    /*

            创建String,StringBuilder,ArrayList对象,打印对象名都是元素内容,而不是地址值

    ---------------------------------------------------------------------------

            ArrayList集合的使用：
                     1.构造方法

                                public ArrayList():创建一个空的集合器

                    2.集合容器的创建细节:

                                ArrayList list = new ArrayList();

                                    可以添加任意类型数据,数据不严谨--warning

                                ArrayList<String> list = new ArrayList();

                                        <>:泛型
                                            对集合中存储的数据,进行类型限制
                                            泛型中,不允许编写基本数据类型
                                                ----若要使用基本数据类型,应使用该基本数据类型的包装类


                byte
                short
                int     --->Integer
                long
                float
                double
                boolean
                char    --->Character

        ______________________________________________________其余的首字母大写即可


     */

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList();//在类名后面带<>,当中申明存储类型

        list1.add("张三");
        list1.add("李四");
        list1.add("王五");

//        list.add(12);
//        list.add(false);
//        list.add('12');

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(100);
        list2.add(95);
        list2.add(78);

        ArrayList<Double> list3 = new ArrayList<>();

        list3.add(11.1);
        list3.add(22.2);
        list3.add(33.3);

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);


    }

}
