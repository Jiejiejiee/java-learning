package com.learn.test;

import java.util.Scanner;

public class Demo6 {
    /*

            评委打分：六个评委为选手打分，分数为0~100的整数
            选手的最后得分为：去掉一个最低分和一个最低分，再取剩下分数的平均值

     */

    public static void main(String[] args) {

        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入评分：");

        for (int i = 0; i < 6; i++) {

            arr[i] = sc.nextInt();

        }

//        int max = getMax(arr);
//        int min = getMin(arr);
//        System.out.println(max);
//        System.out.println(min);

        double result = score(arr);
        System.out.println("选手的最终得分是："+result);

    }

    public static double score(int[] array){

        int sum = 0;
        double result = 0;
        for (int i = 0; i < array.length; i++) {

            sum += array[i];

        }

        result = (sum - getMin(array) - getMax(array)) * 1.0 / 4;
        return result;

    }

    public static int getMax(int[] array){

        int max = array[0];
        for (int i = 1; i < array.length; i++) {

            if (array[i] > max){
                max = array[i];
            }

        }

        return max;

    }    public static int getMin(int[] array){

        int min = array[0];
        for (int i = 1; i < array.length; i++) {

            if (array[i] < min){
                min = array[i];
            }

        }

        return min;

    }

}
