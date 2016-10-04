package com.tertiaryinfotech;
import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        double x, y, z;
        double avg;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        x = in.nextDouble();
        y = in.nextDouble();
        z = in.nextDouble();
        avg = average(x,y,z);
        System.out.println("The average is: "+avg);

    }
    public static double average(double num1, double num2, double num3)
    {
        double avg = (num1 + num2 + num3)/3;
        return avg;
    }

}
