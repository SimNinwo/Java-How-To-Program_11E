package com.chapter2.examples;
// Compare integers using if statements, relationship

import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        // create Scanner to obtain input from command line.
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: "); // prompt
        int number1 = input.nextInt(); // read first number

        System.out.print("Enter second integer: "); // prompt
        int number2 = input.nextInt(); // read second number

        if (number1 == number2)
            System.out.printf("%d == %d%n", number1, number2);

        if (number1 != number2)
            System.out.printf("%d != %d%n", number1, number2);

        if (number1 < number2)
            System.out.printf("%d < %d%n", number1, number2);

        if (number1 > number2)
            System.out.printf("%d > %d%n", number1, number2);

        if (number1 <= number2)
            System.out.printf("%d <= %d%n", number1, number2);

        if (number1 >= number2)
            System.out.printf("%d >= %d%n", number1, number2);

        input.close();
    } // end method main
} // end class Comparison
