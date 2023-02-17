public class OperatorDemo2 {
    /*
            自增自减运算符：

                    ++：让变量自身的值+1
                    --：让变量自身的值-1

                1.单独使用:一句代码中，只做++或——
                                ++或--在变量的前面还是后面，没有区别

                2.参与运算使用:++在前，先自增，再操作；++在后，先操作，再自增

     */
    public static void main(String[] args) {

        int a = 10;
        int b = a++;//b = 10,a = 11
        int c = ++a;//a = 12,c = 12
        System.out.println(b);
        System.out.println(c);
    }
}
