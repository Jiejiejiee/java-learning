package com.learn.grammer;

public class ForDemo1 {
    public static void main(String[] args) {
        /*

                求和思想

         */

        int result1 = getSum1();//生成方法返回值的快捷键：可在原本getSum()后加.var
        System.out.println("1~100之间的整数和为："+result1);

        int result2 = getSum2();
        System.out.println("1~100之间的整数和为："+result2);


    }

    public static int getSum1(){

        int sum1 = 0;
        for (int i = 1;i <= 100;i++){

            if (i %2 == 0){
                sum1 += i;
            }

        }

        //System.out.println(sum);//函数有结果返回，则需返回结果
        return sum1;

    }

    public static int getSum2(){

        int sum2 = 0;

        for (int j = 2;j <= 100;j += 2){

            sum2 += j;

        }

        return sum2;

    }

}
