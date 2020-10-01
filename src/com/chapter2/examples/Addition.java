package com.chapter2.examples;
// Addition program inputs two numbers then display the result
import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        // create a Scanner to obtain input from user
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: "); // prompt
        int number1 = input.nextInt(); // read first integer

        System.out.print("Enter second integer: "); // prompt
        int number2 = input.nextInt(); // read second integer

        int sum = number1 + number2; // add numbers

        System.out.printf("Sum is %d%n", sum); // display result

        input.close();
    } // end method main
} // end class Addition
