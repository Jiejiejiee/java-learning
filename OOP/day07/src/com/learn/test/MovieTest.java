package com.learn.test;

import com.learn.domain.Movie;

public class MovieTest {

    public static void main(String[] args) {

        Movie m1 = new Movie(1, "东八区的先生们", "2022", 2.1, "中国大陆", "剧情,戏剧", "夏睿", "张翰,王晓晨");
        Movie m2 = new Movie(2, "上海堡垒", "2019", 2.9, "中国大陆", "爱情,战争,科幻", "滕华涛", "鹿晗,舒淇");
        Movie m3 = new Movie(3, "逐梦演艺圈", "2015", 2.2, "中国大陆", "剧情,戏剧", "毕志飞", "朱一文,李彦爱");

        //数据在测试类中存储,应送到Service层进行逻辑操作

        //如何将一个类的数据,传递给另一个类???
        Movie[] movies = {m1, m2, m3};//用数组存储对象时,存储的是对象的地址值

//        for (int i = 0; i < movies.length; i++) {
//
//            System.out.println(movies[i]);
//
//        }



        MovieService movieService = new MovieService(movies);//将存储的对象,以参数形式返回给操作层
        movieService.start();

    }

}
