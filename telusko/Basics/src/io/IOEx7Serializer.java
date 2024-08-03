package io;

import java.io.*;

class Student implements Serializable {
    private int id;
    private int age;
    transient private String name;
//    private String name;

    public Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
public class IOEx7Serializer {
    public static void main(String[] args) throws IOException {
        Student student = new Student(1,12,"Akash");
        System.out.println(student.toString());
        String filePathname = "C:\\Users\\akash\\Java\\Basics\\src\\io\\student.txt";
        ObjectOutputStream objectOutputStream = null;

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filePathname);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(student);
        } catch (FileNotFoundException _) {

        } finally {
            assert objectOutputStream != null;
            objectOutputStream.close();
        }
    }
}
