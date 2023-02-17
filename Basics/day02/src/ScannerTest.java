import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //键盘录入姓名
        System.out.println("请输入您的姓名：");//提示
        String name = sc.next();

        //键盘录入年龄
        System.out.println("请输入您的年龄：");
        int age = sc.nextInt();

        //键盘录入性别
        System.out.println("请输入您的性别：");
        String gender = sc.next();

        //键盘录入您的身高
        System.out.println("请输入您的身高：");
        double height = sc.nextDouble();

        //键盘录入您的婚姻状况
        System.out.println("请输入您的婚姻状况：");
        boolean flag = sc.nextBoolean();

        System.out.println("注册成功！");

        System.out.println(name);
        System.out.println(gender);
        System.out.println(height);
        System.out.println(flag);

    }
}
