package com.learn.test;

public class Demo5 {
    /*

            数组元素反转：

                已知一个数组arr = {11,22,33,44,55,66}
                输出arr = {66,55,44,33,22,11}

     */

    public static void main(String[] args) {

        int[] arr1 = {11, 22, 33, 44, 55, 66};
        int[] arr2 = {11, 22, 33, 44, 55, 66};
        swapArray1(arr1);
        System.out.println("---------------------------");
        swapArray2(arr2);

    }

    public static void swapArray1(int[] array) {

//        思路错误，无法运行
//        int[] result = new int[array.length];
//        int temp = array.length;
//
//        for (int i = 0; i < array.length; i++) {
//
//            int flag = 0;
//            flag = array[i];
//
//            for (int j = array.length; j >=0; j--){
//                result[j] = flag;
//            }
//
//        }
//
//        for (int i = 0; i < result.length; i++) {
//            System.out.println(result[i]);
//        }

        //1.确定好，谁和谁交换[0]<=>[5],[1]<=>[4],[2]<=>[3]
        //2.定义第三方变量

//        int temp = array[0];
//        array[0] = array[5];
//        array[5] = temp;
//
//        for (int i = 0; i < array.length; i++) {
//
//            System.out.println(array[i]);

//        }

        for (int i = 0; i < array.length / 2; i++) {//若i < array.length ，运行到后面代码还会将倒序调整回来

            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;

        }

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);

        }


    }

    public static void swapArray2(int[] array){
        /*

                在程序中设计两个指针，指针所指的位置交换

                    1.定义两个变量，模拟开始和结束指针
                        int start = 0;
                        int end = array.length - 1

                    2.交换
                    3.指针移动
                        start++;
                        end--;
                    4.设定交换条件：start < end


         */

        int start = 0;
        int end = array.length - 1;

        for (;start < end ;start++,end--){//注意条件

            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

        }

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);

        }

    }

}
