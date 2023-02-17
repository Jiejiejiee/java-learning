package com.learn.grammer;

public class ForDemo3 {
    /*

            for循环注意事项：
                    1.for循环{}中定义的变量，在每一轮循环结束后都会从内存中被释放
                    2.for循环()中定义的变量，会在整个循环结束后从内存中释放


            循环嵌套：
                    当循环体执行完一次，下一轮循环才会开启

     */

    public static void main(String[] args) {

        forTest2();

    }

    public static void forTest1(){

        for (int i = 0; i < 5; i++) {//快捷键5.fori

            int num = 10;
            System.out.println("...");

        }

    }

    public static void forTest2(){

        for (int i = 0;i <= 5;i++){

            for (int j = 0;j <= 5;j++){

                System.out.println("hello world");

            }

        }

    }


}
