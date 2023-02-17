package com.learn.test;


public class StringBuilderTest2 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,6,5,4,8};
        String result = arrayToString(arr);
        System.out.println(result);


    }

    public static String arrayToString(int[] arr){

        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1){
                sb.append(", ");
            }else {
                break;
            }
        }

        sb.append("]");

//        String result = sb.toString();
        return sb.toString();

    }

}
