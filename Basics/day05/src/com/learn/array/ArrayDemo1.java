package com.learn.array;

public class ArrayDemo1 {
    /*
            数组的定义格式：

                    1.数据类型[] 数组名;

                    2.数据类型 数组名[];
     */
    public static void main(String[] args) {

        arrayTest1();


    }

    /*

        数组静态初始化格式：

                1.完整格式：
                                数据类型[] 数组名 = new 数据类型[]{元素1 , 元素2 , 元素3 ,,,}
                2.简化格式：
                                数据类型[] 数组名 = {元素1 , 元素2 , 元素3 ,,,}

            --------------------------------------------------------------------------

            @:分隔符
            [:当前空间，是数组类型的
            I:当前数组类型，是int类型
            1b6d3586:数组的十六进制内存地址


     */
    public static void arrayTest1(){

        int array1[];
        int[] array2;//只定义了数组类型的变量名，内存中还未创建数组容器

        int arr1[] = new int[]{1,2,3,4};
        double arr2[] = {1.2,1.6,2.3};

        System.out.println(arr1);//[I@1b6d3586
        System.out.println(arr2);//[D@4554617c

    }



}
