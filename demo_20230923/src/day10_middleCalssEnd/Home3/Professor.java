package day10_middleCalssEnd.Home3;

public class Professor extends Teacher {
    public Professor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public void introduce() {
        System.out.println();
        super.introduce();
    }
}
