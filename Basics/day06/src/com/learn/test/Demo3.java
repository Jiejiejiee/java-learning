package com.learn.test;

public class Demo3 {
    /*

            定义一个方法，用于比较两个数组的内容是否相同

                要求：长度，内容，顺序完全相同



        ==:
            1.基本数据类型：比较数据值
            2.引用数据类型：比较地址值

     */

    public static void main(String[] args) {

        int[] arr1 = {11, 22, 33, 44, 55, 66};
        int[] arr2 = {11, 22, 33, 44, 55, 66};

        boolean result = contentArray(arr1, arr2);
        System.out.println(result);

    }

    public static boolean contentArray(int[] array1, int[] array2) {

//        if (array1.length == array2.length){
//
//            for (int i = 0; i < array1.length; i++) {
//
//                if (array1[i] == array2[i]){
//
//                    return true;
//
//                }
//
//            }
//
//        }else return false;
//
//    }//代码中true,false混杂，不好返回boolean类型值

        if (array1.length != array2.length) {
            return false;
        }
        //代码能走到这里，说明array1.length = array2.length
        for (int i = 0; i < array1.length; i++) {

            if (array1[i] != array2[i]) {
                return false;
            }

        }
        //先把所有false情况列举出来，程序到这一定是true，直接返回即可

        return true;

    }
}
