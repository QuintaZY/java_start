package day8_poly.dynamic_;

public class DynamicBinding {
    /**
     * 当调用对象方法的时候，该方法回个该对象的内存绑定
     * 当嗲用对象属性时，没有动态绑定机制，哪里声明，哪里使用
     * */
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.sum());
        System.out.println(a.sum1());
    }
}
class A {
    public int i = 10;

    public int sum() {
        return getI() + 10;
    }
    public int sum1 () {
        return i + 10;
    }
    public int getI() {
        return i;
    }
}
class B extends A {
    public int i = 20;
//    public int sum () {
//        return i + 20;
//    }
    public int getI() {
        return i;
    }
//    public int sum1 () {
//        return i + 20;
//    }
}