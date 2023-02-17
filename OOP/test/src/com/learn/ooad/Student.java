package com.learn.ooad;

/*

        属性：
            成员变量：同之前定义变量的格式一样，只不过位置放在方法的外面

        行为：
            成员方法：跟之前定义方法的格式一样，要全掉static关键字

 */
public class Student {

    String name = "张三";
    int age = 23;

    public void study(){
        System.out.println("去教室学习");
    }

    public void eat(){
        System.out.println("去食堂吃饭");
    }

}
