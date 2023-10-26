package day7_poly;

public class Master {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Master(String name) {
        this.name = name;
    }

    public void feed(Dog dog, Bone bone) {
        System.out.println("主人" + name + " 给 " + dog.getName() + " 吃 " + bone.getName());
    }
}
