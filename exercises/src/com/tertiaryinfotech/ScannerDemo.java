package com.tertiaryinfotech;
import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int a = input.nextInt();
        System.out.println("The number you entered is " + a);

        System.out.print("Please enter a Floating number: ");
        double b = input.nextDouble();
        System.out.println("The number you entered is " + b);

        System.out.print("Please enter a string: ");
        String c = input.next();
        System.out.println("The string you entered is " + c);
    }
}
