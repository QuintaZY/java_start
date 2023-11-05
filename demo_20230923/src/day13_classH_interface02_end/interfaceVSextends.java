package day13_classH_interface02_end;

public class interfaceVSextends {
    public static void main(String[] args) {
        LittleMonkey wikong = new LittleMonkey("寻悟空");
        wikong.climbing();
        wikong.swimming();
    }
}

class Monkey {
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void climbing() {
        System.out.println(name + "猴子会爬树");
    }
}
// 接口
interface Fishable {
    void swimming();
}
class LittleMonkey extends Monkey implements Fishable{
    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println("通过学习可以游泳");
    }
}