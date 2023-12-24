package day20_Generic;

public class Generic_05_CustomGeneric {
    public static void main(String[] args) {
//        Tigers<Object, Object, Object> join = new Tigers<>("join");

    }
}

/*
* Tiger 后面泛型， 所以我们把Tiger就成为自定义泛型类
* T, R, M 泛型的标识符， 一般是单个大写字母
* 泛型标识符可以有多个
* 普通成员可以使用泛型 （属性，方法）
* 使用泛型的数组，不能初始化
* 静态方法中不能使用类的泛型
* */
class Tigers<T, R, M> {
    String name;
    R r;
    T t;
    M m;

    public Tigers(String name, R r, M m, T t) {

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {  // 方法使用到泛型
        this.r = r;
    }

    public T getT() { // 返回类型
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }
}
