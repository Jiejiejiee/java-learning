package com.learn.test;

import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Demo4 {
    /*

            设计出一个方法，查找元素在数组中的索引位置

            已知一个数组arr = {19,28,37,46,50}
            键盘录入一个数据，查找该数据在数组中的索引并输出
            若没有查找到，测输出-1

     */

    public static void main(String[] args) {

        System.out.println("请输入查找元素：");
        Scanner sc = new Scanner(System.in);

        int[] arr1 = {19, 28, 37, 46, 50};
        int[] arr2 = {19, 28, 37, 46, 50, 28, 19, 19};
        int a = sc.nextInt();

        int result1 = getIndex1(a,arr1);
        System.out.println(result1);
        System.out.println("________________________");

        getIndex2(a,arr2);


    }

    /**
     * 该方法只能找到该元素第一次出现时的索引
     *
     * @param a
     * @return
     */
    public static int getIndex1(int a,int[] array) {

        int x = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] == a) {

                return i;

            }

        }

        return -1;
    }


    /*

            retrun只能返回一个结果

            当一个方法运行结束后，有多个结果需要返回，

                    可以将结果装入数组容器，将数组返回

     */
    public static void getIndex2(int a,int[] array) {

//        int[] result = {};//元素长度未知，应用逻辑得到长度再动态定义数组长度
        int count = 0;


        for (int i = 0; i < array.length; i++) {

            if (array[i] == a) {

                count++;

            }

        }

        //根据统计出来的个数，创建数组容器
        int[] result = new int[count];
        int temp = 0;

        //查找元素在数组中的索引，并将找到的索引存入数组

        for (int i = 0; i < array.length; i++) {

            if (array[i] == a){

                result[temp] = i;
                temp ++;

            }

        }

        if (temp != 0) {

            for (int i = 0; i < result.length; i++) {
                System.out.println(result[i]);
            }
        }else {
            System.out.println(-1);
        }

    }


}
