package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

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
public class ConstructorRefEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Akash", "Boora", "Srinivas", "Sharadha");
        List<Integer> age = Arrays.asList(18,22,30,40);

        List<Student> students = new ArrayList<>();
        for (String name: names){
            students.add(new Student(name));
        }

        students.forEach(System.out::println);
        System.out.println("=======================================");


        List<Student> students1 = new ArrayList<>();
        students1 = names.stream().map(name->new Student(name)).toList();

        students1.forEach(System.out::println);

        System.out.println("=======================================");

        List<Student> students2 = new ArrayList<>();
        students2 = names.stream().map(Student::new).toList();

        students2.forEach(System.out::println);



    }
}
