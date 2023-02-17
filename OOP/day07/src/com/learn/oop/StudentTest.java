package com.learn.oop;

public class StudentTest {
    /*

            带有主方法的类为测试类

                创建student类的对象进行使用

                    1.格式：

                                类名 对象名 = new 类名();

                    2.调用：

                                对象名.成员变量
                                对象名.成员方法();

-------------------------------------------------------------------------------------

        细节:

                1.打印对象名,可以看到对象的内存地址

                    com.learn.oop.Student@1b6d3586
                    全类名:包名+类名

                2.成员变量即使没有赋值,也可以直接使用,用的是属性的默认值

     */

    public static void main(String[] arg){

        Student stu1 = new Student();
        System.out.println(stu1);//com.learn.oop.Student@1b6d3586

        stu1.name = "张三";
        stu1.age = 23;

        System.out.println(stu1.name);
        System.out.println(stu1.age);

        stu1.study();
        stu1.eat();

    }

}
