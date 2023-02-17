package com.learn.test;

import com.learn.student.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        //测试数据
//        list.add(new Student("001","张三",23,"2001-03-05"));
//        list.add(new Student("002","李四",23,"2001-03-05"));
//        list.add(new Student("003","王五",23,"2001-03-05"));
//        list.add(new Student("004","沈六",23,"2001-03-05"));

        lo:
        while (true){
            System.out.println("-----欢迎使用学生管理系统-----");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出");
            System.out.println("请选择功能:");

            int temp = sc.nextInt();


            switch (temp){
                case 1:
                    //System.out.println("添加学生");
                    addStudent(list);
                    break;
                case 2:
                    //System.out.println("删除学生");
                    removeStudent(list);
                    break;
                case 3:
                    //System.out.println("修改学生");
                    alterStudent(list);
                    break;
                case 4:
                    //System.out.println("查询学生");
                    checkStudent(list);
                    break;
                case 5:
                    System.out.println("感谢您的使用,再见!");
//                    System.exit(0);//终止正在运行的JVM虚拟机
                    break lo;
                default:
                    System.out.println("输入有误,请检查");
                    break;
            }

        }

    }

    private static void addStudent(ArrayList<Student> list) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生Id:");

        /**此种判断学号的方法进入死循环,原因未知
         *         for (int i = 0; i < list.size(); i++) {
         *             Student stu = list.get(i);
         *             if (stu.getId() == id){
         *                 System.out.println("Id重复,请重新输入!");
         *                 break;
         *             }else break;
         *         }
         */
        //可以通过判断索引,来查看id是否重复

        while (true){

            String id = sc.next();
            int index = getIndex(id, list);

            if (index == -1){
                System.out.println("学号可用!");
                System.out.println("请输入学生姓名:");
                String name = sc.next();

                System.out.println("请输入学生年龄:");
                int age = sc.nextInt();

                System.out.println("请输入学生生日:");
                String birthday = sc.next();

                list.add(new Student(id,name,age,birthday));
                System.out.println("添加成功!");
                break;
            }else {
                System.out.println("学号重复,添加失败!");//此处应该循环上面的步骤
            }
        }

    }

    //若在删除和修改方法中都设置索引去查找,代码冗余.应先找到对应的索引(使用一个独立的方法),再通过索引进行删除和修改
    /**
     *     private static void alterStudent(ArrayList<Student> list) {
     *
     *         if (list.size() == 0){
     *             System.out.println("未存有学生信息!");
     *         }else {
     *
     *             System.out.println("请输入需要修改信息的学生id:");
     *
     *             Scanner sc = new Scanner(System.in);
     *             String input = sc.nextLine();
     *
     *             for (int i = 0; i < list.size(); i++) {
     *                 Student s = list.get(i);
     *                 if (s.getId().equals(input)){
     *                     System.out.println("请选择需要修改的信息:");
     *                     System.out.println("1.姓名");
     *                     System.out.println("2.年龄");
     *                     System.out.println("3.生日");
     *
     *                     int temp = sc.nextInt();
     *
     *                     switch (temp){
     *                         case 1:
     *                             System.out.println("请输入要修改的姓名:");
     *                             String name = sc.nextLine();
     *                             list.set(i,s.setName(name));
     *                     }
     *
     *                 }
     *             }
     *         }
     *
     *     }
     * @param list
     */

    private static void alterStudent(ArrayList<Student> list) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入需要修改的学生Id:");

        String input = sc.nextLine();
        int index = getIndex(input, list);

        if (index == -1){
            System.out.println("未查询到该学生,修改失败!");
        }else {
            System.out.println("请输入新的学生姓名:");
            String name = sc.next();
            System.out.println("请输入新的学生年龄:");
            int age = sc.nextInt();
            System.out.println("请输入新的学生生日:");
            String birthday = sc.next();

            Student updateStudent = new Student(input,name,age,birthday);
            list.set(index,updateStudent);//根据索引,换掉一整个student对象

            System.out.println("修改成功!");

        }

    }


    private static void removeStudent(ArrayList<Student> list) {

        /**         该方法未用到索引,需要频繁遍历和判断
         *
         *         if (list.size() == 0){
         *             System.out.println("未存有学生信息!");
         *         }else {
         *             System.out.println("请输入删除学生Id:");
         *
         *             Scanner sc = new Scanner(System.in);
         *             String input = sc.nextLine();
         *
         *             for (int i = 0; i < list.size(); i++) {
         *                 Student s = list.get(i);
         *                 if (s.getId().equals(input)){
         *                     list.remove(i);
         *                     System.out.println("删除成功!");
         *                 }
         *             }
         *         }
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入需要删除的学生Id:");

        String input = sc.nextLine();
        int index = getIndex(input, list);

        if (index == -1){
            System.out.println("未查询到该学生,删除失败!");
        }else {
            list.remove(index);
            System.out.println("删除成功!");
        }

    }

    private static void checkStudent(ArrayList<Student> list) {

        if (list.size() == 0){
            System.out.println("请输入学生信息,稍后进行查询!");
        }else {

            System.out.println("学号\t\t姓名\t\t年龄\t\t\t生日");

            for (int i = 0; i < list.size(); i++) {
                Student s = list.get(i);
                System.out.println(s.getId()+"\t\t"+s.getName()+"\t\t"+s.getAge()+"\t\t"+s.getBirthday());
            }

        }

    }

    private static int getIndex(String id, ArrayList<Student> list){

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stu.getId().equals(id)){
                return i;
            }
        }
        return -1;

    }


}
