package day20_Generic;

import java.util.ArrayList;

public class Generic_04_detail {
    public static void main(String[] args) {
        // 1.给泛型指向数据类型是， 要求是引用类型，不能是基本数据类型
        ArrayList<Integer> list = new ArrayList<>();

        // 2.
        ArrayList<A> al1 = new ArrayList<A>();
        // 因为 E 指定了 A 类型， 构造器传入了 new A()
        Pig<A> aPig = new Pig<A>(new A());
        Pig<A> aPig1 = new Pig<A>(new B());

        // 泛型默认是Object
//        ArrayList arrayList = new ArrayList();
    }
}

class Tiger<E> {
    E e;
    public Tiger() {}
    public Tiger(Object e) {
        System.out.println( );
    }
}

class A {}
class B extends A {}
class Pig<E> {
    E e;
    public Pig(E e) {
        this.e = e;
    }
}