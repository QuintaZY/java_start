package day8_poly.dynamic_.polyarr_;

public class PloyArray {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("jack", 20);
        persons[1] = new Student("jack", 20, 100);
        persons[2] = new Student("jack", 200, 200);
        persons[3] = new Teacher("jack", 200, 200);
        persons[4] = new Teacher("jack", 200, 200);

//
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].say());
//
            if (persons[i] instanceof Student) {
//                ((Student) persons[i]).study();
                Student student = (Student)persons[i];
                student.study();
            } else if (persons[i] instanceof Teacher) {
                Teacher teacher = (Teacher)persons[i];
                teacher.teach();
            } else {
                System.out.println("错误");
            }
        }
    }
}
