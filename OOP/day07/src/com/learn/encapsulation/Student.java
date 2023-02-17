package com.learn.encapsulation;

import com.sun.xml.internal.bind.v2.model.core.ID;

public class Student {
    /*

        1.私有成员变量为了保证数据的安全性

        2.针对私有的成员变量,提供对应的set和get方法

            set:设置
            get:获取

     */

    private int age;

    public void setAge(int age){

        if (age >= 1 && age <= 120){

            this.age = age;

        }else {

            System.out.println("错误");

        }

    }

    public int getAge(){

        return age;//this.age

    }

}
