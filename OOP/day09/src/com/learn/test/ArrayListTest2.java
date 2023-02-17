package com.learn.test;

import com.learn.domain.Student;

import java.util.ArrayList;

public class ArrayListTest2 {
    /*

        创建一个存储学生对象的集合，存储3个对象，使用程序实现在控制台遍历该集合

                展示出年龄低于22的学生

     */

    public static void main(String[] args) {

        Student stu1 = new Student("张三", 23);
        Student stu2 = new Student("李四", 18);
        Student stu3 = new Student("王五", 21);

        ArrayList<Student> list = new ArrayList<>();

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));//student类型打印只能出来地址值,应该用赋给基本变量类型再输出
            Student student = list.get(i);
            System.out.println(student.getName() + "..." + student.getAge());
        }

        System.out.println("------------------------------");

        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            if (student.getAge() < 22){
                System.out.println(student.getName()+"..."+student.getAge());
            }
        }

    }

}
