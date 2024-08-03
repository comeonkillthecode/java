package oops.inheritance;

public class Practise {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Calculator calculator1 = new AdvanceCalculator();
        AdvanceCalculator calculator2 = new AdvanceCalculator();
        ScientificCalculator scientificCalculator = new ScientificCalculator();

        System.out.println(calculator1.add(8, 2));
        System.out.println(calculator2.divide(8,2));
        System.out.println(scientificCalculator.power(4,4));
    }
}
