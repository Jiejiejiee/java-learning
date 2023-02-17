import javax.net.ssl.SSLContext;

public class VariableDemo1 {
    /*
        变量：内存中的存储空间，空间中记录着经常发生变化的数据

        变量的定义格式：

                    数据类型 变量名 = 数据值；

                    数据类型：整数 int
     */
    public static void main(String[] args) {
        int salary = 12000;//将等号右侧的数据赋给等号左边的名
        System.out.println(salary);

        salary = 15000;//只有前面带了数据类型的才是定义了一个新变量
        System.out.println(salary);

        int age = 18;
        System.out.println(age);
    }
}
