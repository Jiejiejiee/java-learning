package com.learn.grammer;

import java.time.temporal.TemporalAmount;

public class ForDemo2 {
    /*

            水仙花数：一个三位数，它的个位、十位、百位的数字立方之和等于原数

            统计思想

     */

    public static void main(String[] args) {

        int result = daffodilNumber();
        System.out.println("水仙花数的个数为："+result);

    }

    public static int daffodilNumber(){


        int count = 0;
        for (int i = 100;i <= 999;i++){
            int a,b,c = 0;
            a = i / 100;//i的百位
            b =( i / 10) % 10;//i的十位
            c = i % 10;//i的个位

            if (a*a*a + b*b*b + c*c*c == i){

                System.out.println("水仙花数有："+i);
                count += 1;

            }

        }

        //System.out.println("水仙花数的个数为："+count);//该函数有结果输出，应return
        return count;

    }

}
