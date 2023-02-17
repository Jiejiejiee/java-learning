package com.learn.test;

import com.learn.domain.Student;

import java.util.ArrayList;

public class ArrayListTest5 {
    /*

        定义一个方法,方法接收一个集合对象,泛型为Student

                方法内部将年龄低于18的学生对象找出
                并存入新集合对象,方法返回新集合

     */

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        Student stu1 = new Student("张三",17);
        Student stu2 = new Student("李四",16);
        Student stu3 = new Student("王五",19);
        Student stu4 = new Student("沈六",16);
        Student stu5 = new Student("钱七",20);
        Student stu6 = new Student("周十",18);

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        list.add(stu5);
        list.add(stu6);

        ArrayList<Student> students = checkStudent(list);

        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println(s.getName()+"..."+s.getAge());
        }

    }

    private static ArrayList<Student> checkStudent(ArrayList<Student> list) {

        ArrayList<Student> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if (s.getAge() < 18){
                list1.add(list.get(i));
            }
        }

//        System.out.println(list1);
        return list1;

    }

}
