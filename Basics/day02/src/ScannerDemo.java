import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        /*

                int a = sc.nextInt();       从键盘录入整数，并使用int类型变量接收
                double b = sc.nextDouble();     从键盘录入小数，并使用double类型变量接收
                boolean flag = sc.nextBoolean();        从键盘录入布尔，并使用boolean类型变量接收
                string name = sc.next();        从键盘录入字符串，并使用string类型变量接收
         */

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();//用一个变量将键入数据存储起来
        System.out.println(age);

        Scanner xc = new Scanner(System.in);
        double height = xc.nextDouble();
        System.out.println(height);
    }
}
