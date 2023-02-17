package com.learn.method;

public class MethodDemo2 {
    /*
            带参数方法的定义与使用

                定义格式
                        public static void 方法名(数据类型 变量名1 , 数据类型 变量名2 ...){
                            方法体
                        }

                调用时需带参数

     */
    public static void main(String[] args) {

        getMax(20 , 23);//实参

        getName("lwj");
        getName("liwenjie");

    }

    public static void getMax(int a , int b){//形参

        int max = a > b? a:b;
        System.out.println(max);

    }

    public static void getName(String name){

        System.out.println(name);

    }

}
