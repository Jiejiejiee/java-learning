package com.learn.dyadicarray;


public class ArrayDemo2 {
    /*

            遍历二维数组中的元素：先遍历一维数组，再遍历一维数组中的每一个元素

     */

    public static void main(String[] args) {

        int[][] arr = {
                {11, 22, 33},
                {33, 44, 55}
        };

        printArray(arr);

        int sum = getSum(arr);
        System.out.println("求和结果为："+sum);

    }

    public static void printArray(int[][] array) {


//        for (int i = 0; i < array.length; i++) {
//            //用temp先接收一维数组
//            int temp = array[i];
//            //继续遍历一维数组，获得内部的元素
//
//            for (int j = 0; j < array.length; j++) {
//
//                System.out.println(temp[j]);
//
//            }

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {//array.length错误,应是遍历完的一维数组长度

                System.out.println(array[i][j]);
            }

        }


    }

    public static int getSum(int[][] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                sum += array[i][j];

            }

        }
        return sum;

    }
}





