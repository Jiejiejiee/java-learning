public class TypeConversionDemo2 {
    /*
            类型转换-强制转换

                    强制转换有可能出现精度损失

                byte,short,char在运算时会直接提升为int类型



     */
    public static void main(String[] args) {

        double a = 12.3;
        int b = (int) a;
        System.out.println(b);
    }
}
