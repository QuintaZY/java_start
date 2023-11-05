package day13_classH_innerclass;

public class exercise01 {
    public static void main(String[] args) {
        f1(new IL() {
            @Override
            public void show() {
                System.out.println("这是匿名类");
            }
        });
    }
    public static void f1(IL il) {
        il.show();
    }
}


interface IL {
    void show();
}