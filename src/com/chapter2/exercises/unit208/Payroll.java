package com.chapter2.exercises.unit208;
// Program performs a simple payroll calculation.

import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int b = input.nextInt();

        System.out.print("Enter an integer: ");
        int c = input.nextInt();

        int a = b * c;

    }
}
