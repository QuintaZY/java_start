package day20_Generic;

public class Generic_06_InterfaceGeneric {
    public static void main(String[] args) {

    }
}

interface IA extends IUsb<String, Double> {

}

// 当实现IA接口时， IA在继承IUsu 接口时， 指定了U 为 String R为Double
class AA implements IA{

    @Override
    public Double get(String s) {
        return null;
    }

    @Override
    public void hi(Double aDouble) {

    }

    @Override
    public void run(Double r1, Double r2, String u1, String u2) {

    }
}
interface IUsb<U, R> {
    R get(U u);
    void hi(R r);
    void run(R r1, R r2, U u1, U u2);

    default R method(U u) {
        return null;
    }
}
