package com.learn.dyadicarray;

public class ArrayDemo1 {
    /*

            二维数组在存储一维数组的时候，具体存储的是一维数组的地址值


            二位数组访问格式：

                数组名[m索引][n索引]

                m索引：指定访问哪一个一维数组
                n索引：访问一维数组中的哪一个元素

     */

    public static void main(String[] args) {

        int[][] arr = {
                {11,22,33},
                {33,44,55}
        };

        System.out.println(arr);//[[I@1b6d3586 数组地址

        System.out.println(arr[0]);//[I@4554617c
        System.out.println(arr[1]);//[I@74a14482

        System.out.println(arr[0][2]);

    }

}
