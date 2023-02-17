package com.learn.method;

public class MethodDemo3 {
    /*

            带返回值的函数调用：

                public static 数据类型 方法名（数据类型 变量名1 , 数据类型 变量名2 ...）{
                    return 数据值；
                }


     */
    public static void main(String[] args) {

        //返回值前一定要有一个变量接收，否则数据会丢失
        int result = getMax(10,20);//return结果返回到此处，但没有容器记录，数据丢失。需申请一个变量result记录，存储下来方便后续使用

        System.out.println(result);

        check(result);

    }

    //void:当前方法，没有返回值
    public static int getMax(int a , int b){//函数需返回值时，前面的void应该为返回数值的数据类型

        int max = a > b? a:b;

        return max;//从哪调用的函数，结果就返回到哪

    }

    public static void check(int x){

        if (x % 2 ==1){
            System.out.println("结果为奇数");
        }

        else if (x % 2 == 0){
            System.out.println("结果为偶数");
        }

    }

}
