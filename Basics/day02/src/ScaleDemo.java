public class ScaleDemo {
    /*
            计算机进制

                十进制：默认
                二进制：0b开头
                八进制：0开头
                        -09机器会识别成八进制9，进而报错
                        编写数据时，尽量不要以0开头
                十六进制：0x开头
     */
    public static void main(String[] args) {

        System.out.println(110);
        System.out.println(0b110);
        System.out.println(0110);
        System.out.println(0x110);

    }
}
