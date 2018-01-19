package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        Random generator = new Random();
        int max = 10000;
        int answer;
        int guess;
        boolean ask = true;
        boolean ask2 = true;
        String another;
        String[][]numGuess
        double convertNumber = Double.parseDouble(userEntry);

        for (int i = 1; i <10000 ; i++) {

        }
        answer = generator.nextInt(max) + 1;
        while (ask2) {
            System.out.println("Enter a number between 1 and "+ max +". Try to guess the number I picked");
public static String[[]]


        }
       do while (ask) {
            int guessNum = 0;
            guess = sc.nextInt();
            if (guess > answer) {
                System.out.println("Your " + guess + " is too high. Tyr again.");
            } else if (guess < answer) {
                System.out.println("Your " + guess + "is too low. Try again.");
            } else if (guess == answer) {
                System.out.println("Ba Da Bing! You Guessed it!");
            }
            System.out.println("It took you "+ numGuess);
        }
        System.out.println("Would you like to play again");
        another = sc.next();
        {
            if (another.equalsIgnoreCase("yes")) {
                ask2 = true;

            } else {
                ask2 = false;
                System.out.println("Goodbye.");
            }
        }


    }
}

