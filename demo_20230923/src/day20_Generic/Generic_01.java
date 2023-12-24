package day20_Generic;

import java.util.ArrayList;

public class Generic_01 {
    public static void main(String[] args) {
        // 当我们 ArrayList<Dog> 表示存放到 ArrayList 集合中的元素是Dog
        // 如果不满足要求，就会报错
        // 在便利的时候  可以直接去除 Dog 类型而不是 Object
        // public class ArrayList<E> {} E称为泛型, 那么 Dog -> E
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("xxx", 10));
        dogs.add(new Dog("xxsax", 11));


//        dogs.add(new Cat("aaa", 2));
    }
}

class Dog {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Cat {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
