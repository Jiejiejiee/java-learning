package com.learn.domain;

public class Student {
    /*

        标准的javaBean:

                1.成员变量私有化

                2.空参,带参构造方法

                3.对于稀有的成员变量,提供对应的set和get方法


        快捷键:constructor --> select none 构建无参构造方法 --> select all 构建带参构造方法
              getter and setter --> 构建全部成员变量的set和get方法

-----------------------------------------------------------------------------------------------------

        实体类只负责数据的存取,而对数据的处理交给其他类来完成,以实现数据和数据业务处理相分离

     */

    private String name;
    private int age;

//    public Student(){
//
//    }
//
//    public Student(String name , int age){
//
//        this.name = name;
//        this.age = age;
//
//    }
//
//    public void setName(String name){
//
//        this.name = name;
//
//    }
//
//    public String getName(){
//
//        return name;
//
//    }
//
//    public void setAge(int age){
//
//        this.age = age;
//
//    }
//
//    public int getAge(){
//
//        return age;
//
//    }


    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
