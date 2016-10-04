package com.tertiaryinfotech;


public class MultipleReturn {

    public static double[] circle(double r) {

        double[] a = new double[2];

        a[0] = Math.PI * r * r; //area
        a[1] = 2 * Math.PI * r; //circumference

        return a;
    }

    public static void main(String[] args) {

        double[] area = circle(4);

        System.out.printf("Area  = %.2f\n", area[0]);
        System.out.printf("Circumference = %.2f", area[1]);

    }
}