package day20_Generic;

public class Generic_02 {
    public static void main(String[] args) {
        //
        Person<String> person = new Person<String>("韩平");
        Person<Integer> integerPerson = new Person<Integer>(1000);
        person.s();
        integerPerson.s();
    }
}
/*
* 泛型的作用是： 可以在类声明时通过一个标识表示类中某个属性的类型，
* 或者是某个方法的返回值的类型， 或者是参数类型
* */
class Person<E> {
    E s;  // E表示 s的数据类型 ， 该数据类型在定义Person对象的时候指定， 编译期间就确定E是什么类型
    public Person(E s) {
        this.s = s;
    }
    public E f() {
        return s;
    }
    public void s() {
        System.out.println(s.getClass());
    }
}
