package day7_poly;

public class Poly01 {
    public static void main(String[] args) {
        Master master = new Master("汤姆");
        Dog dog = new Dog("大黄");
        Bone bone = new Bone("大昂古");
        master.feed(dog, bone);
    }
}
