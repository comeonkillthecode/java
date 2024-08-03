package org.akash.java.numberguess;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        System.out.println("Lets Start the Game");
        System.out.println("=========================");
        System.out.println();
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int val = random.nextInt(1000) + 1;
        System.out.println("We picked the Number, Now its your turn to guess the number, in 10 chances");
        System.out.println();
        int count = 0;
        int guess;
        System.out.println("Enter your guess");
        do{
            guess = sc.nextInt();
            count++;
            if(guess > val){
                System.out.println("You entered higher number, please try again");
            } else if (guess < val) {
                System.out.println("You entered lower number, please try again");
            }
        }while (guess != val && count < 10);

        if(count == 10 && guess != val){
            System.out.println("Bad luck you could not figure out!");
        }else {
            System.out.println("Congratulations, you guessed it correct!");
        }

    }
}
