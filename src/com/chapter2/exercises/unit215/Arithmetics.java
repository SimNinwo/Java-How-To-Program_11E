package com.chapter2.exercises.unit215;
// Program reads two integers and displays
// their sum, product, difference amd quotient.

import java.util.Scanner;

public class Arithmetics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();

        int sum = firstNumber + secondNumber;
        int product = firstNumber * secondNumber;
        int difference = firstNumber - secondNumber;
        int quotient = firstNumber / secondNumber;

        System.out.println("Sum is " + sum);
        System.out.println("Product is " + product);
        System.out.println("Difference is " + difference);
        System.out.println("Quotient is " + quotient);
    }
}
