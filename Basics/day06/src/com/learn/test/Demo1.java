package com.learn.test;

public class Demo1 {
    /*

            逢七过

     */
    public static void main(String[] args) {

        knockSeven();

    }

    public static void knockSeven(){

        for (int i = 1; i <= 100; i++) {

            if (i % 7 ==0 ||i % 10 == 7 ||i / 10 % 10 == 7 ||i / 100 ==7 ){

                System.out.println("过");

            }else {

                System.out.println(i);

            }

        }

    }

}
