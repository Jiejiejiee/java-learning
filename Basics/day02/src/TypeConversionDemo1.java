public class TypeConversionDemo1 {
    /*
            类型转换-隐式转换

                将取值范围小的的数据或变量，给取值范围大的变量赋值，可以直接赋值
                        小-->大

                取值范围

                        byte -> short -> int -> long -> float -> double

     */
    public static void main(String[] args) {

        int a = 10;
        double b = a;
        System.out.println(b);

        int x = 10;
        double y = 12.3;
        double z = x + y;
        System.out.println(z);

    }
}
