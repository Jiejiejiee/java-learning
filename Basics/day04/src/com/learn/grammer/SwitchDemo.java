package com.learn.grammer;

import java.util.Scanner;

public class SwitchDemo {
    /*

            switch (将要匹配的值){
                case 值1:
                    语句1;
                    break;
                case 值2:
                    语句2;
                    break;
                 ...

                default:
                    语句体+1;
                    break;

            }

            switch()中可接收的类型：

                                基本数据类型：byte,short,char.int

                                应用数据类型：jdk5版本可接收枚举类型,jdk7版本可接收string类型

            值只能是字面量，不能是变量，并且得和接收类型一致


            将()中要匹配的值，与case给出的选项，进行逐个匹配
                匹配成功，执行对应语句体，再由break结束整个switch语句
            如果给出的所有case都匹配失败，则执行最后的default，再由break结束整个switch语句

            没有break语句，switch则会有case穿透现象，会执行下一个case。

            jdk14版本开始，case后允许编写多个数据，冒号之后可用 -> 代替


            -------------------------------------------------------------------
            if语句：适用于范围性的判断

            switch语句：适用于固定值的匹配

     */
    public static void main(String[] args) {

        capital();

    }

    public static void capital(){

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        int num = sc.nextInt();

        switch (num){
            case 1 :
                System.out.println("壹");
                break;
            case 2:
                System.out.println("贰");
                break;
            case 3:
                System.out.println("叁");
                break;
            case 4:
                System.out.println("肆");
                break;
            case 5:
                System.out.println("伍");
                break;
            case 6:
                System.out.println("陆");
                break;
            case 7:
                System.out.println("柒");
                break;
            case 8:
                System.out.println("捌");
                break;
            case 9:
                System.out.println("玖");
                break;

            default:
                System.out.println("超出范围！");
                break;

      }

    }

/*    public static void week(){

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        int week = sc.nextInt();

        switch (week){
            case 1,2,3,4,5 -> System.out.println("工作日");
            case 6,7 -> System.out.println("休息日");
            default -> System.out.println("您的输入有误");
        }

    }
*/



}
