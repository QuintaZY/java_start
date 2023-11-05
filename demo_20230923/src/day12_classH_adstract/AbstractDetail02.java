package day12_classH_adstract;

public class AbstractDetail02 {
    public static void main(String[] args) {

    }
}
// 如果一个类继承了抽象类，他必须实现类的所有抽象方法，除非他自己也声明为abstract类
abstract class E {
    public abstract void H1();
}
abstract class F extends E {

}

class G extends E {
    @Override
    public void H1() { // G子类实现了父类E的抽象方法

    }
}
// 抽象类的本质还是类，所以可以有类的所有成员
abstract class D {
    public int n1 = 10;
    public static String name = "张";
    public void Hi() {
        System.out.println("hi");
    }
    public abstract void hello();
    public static void ok() {
        System.out.println("ok");
    }
}