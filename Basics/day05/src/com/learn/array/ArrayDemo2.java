package com.learn.array;

public class ArrayDemo2 {
    /*
            数组元素的访问格式：
                                数组名[索引]
     */

    public static void main(String[] args) {

        arrayTest();

    }

    public static void arrayTest() {

        int[] arr = {11, 22, 33, 4, 55};

        System.out.println(arr[0]);

        if (arr[0] % 2 == 0){
            System.out.println(arr[0]+"是一个偶数");
        }else {
            System.out.println(arr[0]+"是一个基数");
        }

        //修改数组中第三个元素为66
        arr[2] = 66;
        System.out.println(arr[2]);

        //运用数组中元素
        for (int i = 1;i <= arr[3];i++){
            System.out.println("hello world");
        }

    }


}