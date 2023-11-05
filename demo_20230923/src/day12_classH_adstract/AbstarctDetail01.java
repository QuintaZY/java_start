package day12_classH_adstract;

public class AbstarctDetail01 {
    public static void main(String[] args) {
//        抽象类  不能实例化
//        new A()

    }
}

// 抽象类可以没有抽象方法 ， 可以有实现方法

abstract class A {
    public void hi() {
        System.out.println("hi");
    }
}
// 抽象类只能修饰类和方法，不能修饰属性和其他
class C {
//    public abstract int n1 = 1;
}
