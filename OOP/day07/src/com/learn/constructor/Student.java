package com.learn.constructor;

public class Student {

//    public  Student(){
//
//        System.out.println("Student类构造方法");
//
//    }

    String name;
    int age;

    public Student() {


    }



    public Student(String name , int age){//此处应该把局部变量赋值给成员变量

//        name = "张三";
//        age = 23;

        this.name = name;
        this.age = age;

    }

}
