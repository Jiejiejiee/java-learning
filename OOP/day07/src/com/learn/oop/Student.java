package com.learn.oop;

/*

        JAVA当中要想创建对象，必须要有类的存在

        类：一组类型和行为的集合，将其看作是类的设计图

        对象：是设计图（类），创建出的实体

        类和对象的关系：

            1.依赖关系：需要根据类，来创建对象
            2.数量关系：根据一个类，可以创建出多个对象

        类的组成：

                类的本质：就是对事物进行的描述

                1.属性

                2.行为

--------------------------------------------------------------



 */
public class Student {

    String name ;
    int age ;

    public void study(){
        System.out.println("学习");
    }

    public void eat(){
        System.out.println("吃饭");
    }



}
