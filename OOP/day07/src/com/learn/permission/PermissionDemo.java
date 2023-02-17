package com.learn.permission;

public class PermissionDemo {
/*

        权限修饰符：

            private:只能在同一个类中使用
            (default):同一个类,同一个包中
            protected:同一个类,同一个包中,不同包的子类
                    todo:继承
            public:可以在任意位置访问

 */
    public static void main(String[] args) {

        Student stu = new Student();
        stu.age = 18;//
        stu.show();

    }

}
