package org.akash.java.basic.calculator;

import java.util.Scanner;


public class Execute {
    static final String OPTION_MESSAGE = "Please select the option\n1. Addition \n2. Subtraction \n3. Multiplication \n4. Division\n5. Exit";
    static final String NUMBERS_MESSAGE = "Please enter 2numbers with space between";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new BasicCalculator();
        while (true){
            System.out.println(OPTION_MESSAGE);
            int option = sc.nextInt();
            if (option == 5) {
                break;
            }
            if(option > 5 || option < 0){
                System.out.println("Please enter valid input");
                System.out.println("===============================");
                System.out.println();
                continue;
            }
            System.out.println(NUMBERS_MESSAGE);
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int result = 0;
            switch (option) {
                case 1 -> result = calculator.add(num1, num2);
                case 2 -> result = calculator.sub(num1, num2);
                case 3 -> result = calculator.mul(num1, num2);
                case 4 -> {
                    try {
                        result = calculator.div(num1, num2);
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                        continue;
                    }}
            }
            System.out.println("Result: " + result);
            System.out.println("===============================");
            System.out.println();
        }
        sc.close();
    }
}
