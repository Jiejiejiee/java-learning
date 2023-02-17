package com.learn.constructor;

public class StudentTest {
    /*

        构造方法（构造器）：

            创建对象的时候，要执行的方法

        格式：

            1.方法名与类名相同，大小写也要一致
            2.没有返回值类型，连void也没有
            3.没有具体的返回值（不能有return语句带回结果数据）


        构造方法的执行时机：

                在创建对象的时候，被执行调用
                每创建一个对象，就会执行一次构造方法

        构造方法的作用

                1.创建对象
                2.结合执行时机，可以创建对象时，给对象中的数据初始化

        构造方法的注意事项：

                1.一个类中，没有编写构造方法，系统会提供一个[默认的][无参数]的构造方法

                    public Student(){

                    }
                2.一个类中,若手动编写了构造方法,系统将不会再提供默认的构造方法
                3.构造方法不允许手动调用



        **编写类的时候,无参构造,带参构造,全部手动给出**

     */
    public static void main(String[] args) {

        Student stu1 = new Student("张三" , 23);

        System.out.println(stu1.name+","+stu1.age);

        Student stu2 = new Student("李四"  , 18);

        System.out.println(stu2.name+","+stu2.age);

    }


}
