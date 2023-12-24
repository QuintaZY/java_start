package day20_Generic;

public class Generic_07_MethodGeneric {
    public static void main(String[] args) {
        Car car = new Car();
        car.fly("报名", 100); // 调用方法时， 编译器就会确定参数

    }
}


class Car {
    public void run () {

    }
    // <T,R> 就是泛型
    // 时提供给 fly使用的
    public <T,R> void fly(T t, R r) {

    }
}

class Fish<T,R> {
    public void run() {}
    public <U,M> void eat(U u, M m) {

    }
}