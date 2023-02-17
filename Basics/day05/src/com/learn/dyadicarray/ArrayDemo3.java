package com.learn.dyadicarray;

public class ArrayDemo3 {
    /*

            二维数组动态初始化：

                    数据类型[][] 数组名 = new 数据类型[m][n]

                    m：这个二维数组中可以存放多少一维数组
                    n：在每一个一维数组中可以存放多少个元素

     */

    public static void main(String[] args) {

//        arrayTest1();


        //可以将提前存好的一维数组放到二维数组中去
        //直接将一维数组的地址赋给二维数组中的一维数组
        int[] arr1 = {11,22,33};
        int[] arr2 = {44,55,66};

        int[][] arr = new int[2][3];

        arr[0] = arr1;
        arr[1] = arr2;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.println(arr[i][j]);

            }
        }

    }

    private static void arrayTest1() {
        int[][] arr = new  int[2][3];

        arr[0][0] = 11;
        arr[0][2] = 22;


        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.println(arr[i][j]);

            }

        }
    }




}
