package day13_classH_innerclass;

public class innerclass {
    public static void main(String[] args) {

    }
}


class Outer {
    private int n1 = 100;

    public Outer(int n1) {
        this.n1 = n1;
    }
    public void m1() {
        System.out.println("m1()");
    }
    {
        // 代码块
        System.out.println("代码块");
    }
    class Inner {
        // 内部类，在outer内部
    }
}