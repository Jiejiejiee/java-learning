package com.learn.demo;

public class SwapDemo {
    /*

            面试题：不定义第三方变量，实现两个数据的交换


                    ^ 亦或：相同为false，不通为true

     */

    public static void main(String[] args) {

        /*

            1.将需要运算的数据，转换为二进制数据

                10：0000 1010
                5： 0000 1001

            2.将二进制数的0当作false，1当作true，运算

           0000 1010                         0000 1010
           0000 0101                         0000 0010
        ---------------- 亦或            ------------------亦或
           0000 1111                         0000 1000

        ------------------------------------------------------------

        一个数，被另一个数亦或两次，该数本身不变

         */
        System.out.println(10 ^ 5);//15
        System.out.println(10 ^ 2);//8
        System.out.println(10 ^ 5 ^ 5);//10

        System.out.println("--------------------");

        swap();

    }

    public static void swap(){

        int a = 10;
        int b = 20;

        a = a ^ b;// a = a ^ b; -> a = 10 ^ 20;
        b = a ^ b;// b = a ^ b; -> b = 10 ^ 20 ^ 20; -> b = 10;
        a = a ^ b;// a = a ^ b; -> a = 10 ^ 20 ^ 10; -> a = 20;

        System.out.println(a);
        System.out.println(b);

    }

}
