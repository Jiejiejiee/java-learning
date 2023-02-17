package com.learn.mthis;

public class ThisDemo {
    /*

            当成员变量和局部变量重名了,JAVA采用就近原则

                若非要采用成员变量,使用this关键字

                    this可以区分局部变量和成员变量的重名问题

            this关键字的作用:代表当前类对象的引用（地址）

                this可以调用本类成员(变量,方法)

                    this.本类成员变量
                    this.本类成员方法


            this.的省略规则：

                本类成员方法：没有前提条件，this.可以直接省略

                本类成员变量：方法中没有出现重名的变量，this.可以直接省略

     */
    public static void main(String[] args) {

        Student stu = new Student();

        stu.name = "张三";
        stu.sayHello("李四");



    }



}
