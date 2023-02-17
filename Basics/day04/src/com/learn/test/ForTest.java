package com.learn.test;

public class ForTest {
    /*
            再控制台打印四行五列的*

            System.out.println();打印数据后，有换行效果
            System.out.print();答 打印数据后，无换行效果

     */

    public static void main(String[] args) {

        printRectangle();

    }

    public static void printRectangle(){

        for (int i = 1;i <= 4;i++){

            for (int j = 1;j <= 5;j++){

                System.out.print("*");

            }

            System.out.println();//换行

        }

    }

}
