package org.akash.learn.spring;

public class Dev
{
    private Computer computer;
//    private int age;

//    public Dev(int age) {
//        this.age = age;
//    }


//    public Dev(int age, Laptop laptop) {
//        this.age = age;
//        this.laptop = laptop;
//    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

    public void learn(){
        System.out.println("Learning Spring Boot");
        computer.compile();
    }
}
