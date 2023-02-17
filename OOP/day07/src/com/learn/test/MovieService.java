package com.learn.test;

import com.learn.domain.Movie;

import java.util.Scanner;

public class MovieService {

    Scanner sc = new Scanner(System.in);

    private Movie[] movies;//没有必要暴露

    public MovieService(Movie[] movies) {//已经将数据拿了过来,接下来进行业务操作

        this.movies = movies;//将形式参数的值赋给成员变量,以后的方法就可以使用成员参数

    }

    //启动电影信息管理系统
    public void start() {


        //ctrl+alt+T 选择代码块并进行整合操作

        lo://标号
        while (true) {
            System.out.println("-----------------电影信息系统-----------------");
            System.out.println("请输入您的选择:");
            System.out.println("1.查询全部电影信息");
            System.out.println("2.根据ID查询电影信息");
            System.out.println("3.退出");

            int choice = sc.nextInt();

            switch (choice){
                case 1:
//                    System.out.println("1.查询全部电影信息");
                    queryMovieInfos();
                    break;
                case 2:
//                    System.out.println("2.根据ID查询电影信息");
                    queryMovieInfosById();
                    break;
                case 3:
                    System.out.println("感谢您的使用,再见!");
                    break lo;//通过标号,结束整个无限循环
                default:
                    System.out.println("您的输入有误!");
                    break;
            }
        }

    }
    //展示系统中全部的电影及信息
    private void queryMovieInfos() {
        //遍历数组,找到每一个电影对象的参数
        for (int i = 0; i < movies.length; i++) {
            Movie movie = movies[i];
            //通过电影对象和地址,调用内部get方法,获取电影信息并打印
            System.out.println(movie.getTitle()+"---"+movie.getScore());
        }
    }

    //根据Id查询电影信息
    private void queryMovieInfosById() {
        //键盘录入用户输入的Id
        System.out.println("请输入您要查询的电影编号:");

        int id = sc.nextInt();
        //遍历数组,从中查找信息
        for (int i = 0; i < movies.length; i++) {

            Movie movie = movies[i];
            if (movie.getId() == id){

                System.out.println(movie.getId()+"---"+movie.getTitle()+"---"+movie.getTime()+"---"+movie.getScore()
                +"---"+movie.getArea()+"---"+movie.getType()+"---"+movie.getType()+"---"+movie.getDirector()+"---"+movie.getStarring());

                return;
            }

        }
        //代码到这里,说明没有找到
        System.out.println("未找到您所指定的电影!");

    }
}
