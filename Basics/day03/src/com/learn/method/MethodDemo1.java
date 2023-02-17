package com.learn.method;

public class MethodDemo1 {
    /*
            一段具有独立功能的代码块，不调用就不执行

            提高代码可阅读性，复用性

            格式：
                public static void 方法名(){
                    方法体;
                }

             调用：
                方法名();

-----------------------------------------------------------
            1.方法与方法之间是平级关系，不允许嵌套定义
            2.方法不调用不执行
            3.方法的编写顺序和执行顺序无关，执行顺序即调用顺序

     */

    public static void main(String[] args) {

        eat();

    }

    public static void eat(){
        System.out.println("好想吃炸鸡");
    }

}
