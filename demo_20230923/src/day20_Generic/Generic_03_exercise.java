package day20_Generic;

import java.util.*;

public class Generic_03_exercise {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("长",17));
        students.add(new Student("起",27));
        students.add(new Student("撒",10));
        for (Student student: students) {
            System.out.println(student);
        }

        // 使用泛型
        HashMap<String, Student> hm = new HashMap<String, Student>();
        hm.put("new", new Student("jack",28));
        hm.put("tom", new Student("jacks",28));
        // 迭代器
        Set<Map.Entry<String, Student>> entries = hm.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();

        while (iterator.hasNext()) {

        }
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
