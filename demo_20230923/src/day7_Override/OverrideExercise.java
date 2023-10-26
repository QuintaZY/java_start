package day7_Override;

public class OverrideExercise {
    public static void main(String[] args) {
        Person jack = new Person("jack", 10);
        System.out.println(jack.say());

        Student student = new Student("jack", 10, 31231,32);
        System.out.println(student.say());
    }
}
