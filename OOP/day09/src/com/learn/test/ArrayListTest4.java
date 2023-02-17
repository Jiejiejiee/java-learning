package com.learn.test;

import com.sun.corba.se.spi.ior.IdentifiableFactory;

import java.util.ArrayList;

public class ArrayListTest4 {
    /*

        创建一个存储string的集合,内部存储(test,张三,李四,test,test)字符串

                删除所有的test字符串,删除后,将集合剩余元素打印在控制台


        在遍历集合的过程中,若有删除操作:

                1.正序遍历:索引进行 -- 操作
                2.逆序遍历:无需额外操作

     */

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("test");
        list.add("张三");
        list.add("李四");
        list.add("test");
        list.add("test");
        list.add("王五");

        removeElement(list);

    }

    public static void removeElement(ArrayList<String> list){

//        for (int i = 0; i < list.size(); i++) {
//            String s = list.get(i);
////            System.out.println(s);
//
//            if ("test".equals(s)){//如果是 s.equals("test") ,若s为null会造成空指针异常   变量和常量作比较
//
//                //两个test放在一块,后面一个test删不掉
//                list.remove(i);
//                /**
//                 * 删除了第一个test后,后面的元素会自动补齐删除后空缺的位置,而索引继续自增,导致略过了下一个元素 ---- 露删
//                 */
//                i--;//让索引不自增,访问当前元素
//            }
//
//        }

        for (int i = list.size() - 1; i >= 0; i--) {
//            String s = list.get(i);
            if ("test".equals(list.get(i))){
                list.remove(i);//倒着遍历也可以规避上述问题

            }
        }

        System.out.println(list);

    }

}
