package com.learn.encapsulation;

public class StudentTest {
    /*

        合理隐藏,合理暴露

     */

    public static void main(String[] args) {

        Student stu = new Student();

//        stu.age = -10;
        stu.setAge(23);

        System.out.println(stu.getAge());

    }

}
