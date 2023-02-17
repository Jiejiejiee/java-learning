import java.util.Scanner;

public class OperatorTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        /*
                字符串的拼接
                    System.out.println(2018 + 1 + "年的学生"); ---> 2019年的学生
                    System.out.println("学生是" + 2018 + 1 + "年的"); ---> 学生是20181年的
                                        "学生是2018" + 1 + "年的"
                                        "学生是20181" + "年的"
                                        "学生是20181年的"
                    System.out.println("学生是" +( 2018 + 1 )+ "年的"); ---> 学生是2019年的
         */
        System.out.println("数字的百位为："+num / 100);
        System.out.println("数字的十位为："+(num / 10) % 10);
        System.out.println("数字的个位为："+num % 10);
    }
}
