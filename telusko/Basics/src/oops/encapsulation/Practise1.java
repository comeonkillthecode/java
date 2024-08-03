package oops.encapsulation;

public class Practise1 {
    public static void main(String[] args) {
        Human human = new Human();
        human.setAge(4);
        human.setName("Akash");
        System.out.println("Human Age: "+ human.getAge());
        System.out.println("Human Name: "+ human.getName());
    }
}
