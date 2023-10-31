package day11_classH.static_;

public class ChildGame {
    public static void main(String[] args) {

//        统计有多少小孩
//        count 独立于对象
    }
}

class Child {
    private String name;
//    定义一个变量， 静态变量
    public static int count = 0;

    public Child(String name) {
        this.name = name;
    }
}
