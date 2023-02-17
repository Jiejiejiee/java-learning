package com.learn.test;

public class Demo2 {
    /*

            数组元素求和{68,27,95,88,171,996,51,210}

                1.元素的个位和十位都不能是7
                2.只能是偶数

     */

    public static void main(String[] args) {

        int[] arr = {68,27,95,88,171,996,51,210};

        int sum = getSum(arr);
        System.out.println(sum);

    }

    public static int getSum(int[] array){

        int sum = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0 && array[i] % 10 != 7 && array[i] / 10 % 10 != 7){

                sum += array[i];

            }

        }

        return sum;

    }
}
