package com.learn.test;

import com.learn.domain.Student;
import javafx.scene.control.Slider;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest3 {
    /*

        创建一个存储学生对象的集合,存储3个学生对象,使用程序实现再控制台遍历合集

            学生的姓名和年龄来自键盘录入

     */

    public static void main(String[] args) {

        //1.准备集合容器,用来存储集合对象
        ArrayList<Student> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第"+(i+1)+"个学生的信息");
            addStudent(list);
        }



        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println(student.getName()+"..."+student.getAge());
        }

    }

    private static void addStudent(ArrayList<Student> list) {
        //2.键盘录入学生信息
        Scanner sc = new Scanner(System.in);
        //3.封装
        Student stu1 = new Student();
        System.out.println("请输入学生姓名:");
        stu1.setName(sc.nextLine());
        System.out.println("请输入学生年龄:");
        stu1.setAge(sc.nextInt());

        //4.将封装好的学生对象存入集合
        list.add(stu1);
    }


}
