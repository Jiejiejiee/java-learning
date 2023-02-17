package com.learn.mthis;

public class Student {

    String name;

    public void sayHello(String name){

        System.out.println(name);//李四
        System.out.println(this.name);//张三

        this.method();//调用本类成员方法d

        System.out.println(this);//com.learn.mthis.Student@1b6d3586

    }

    public void method(){

        System.out.println("method...");

    }


}
