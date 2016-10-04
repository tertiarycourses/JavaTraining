package com.tertiaryinfotech;


public class Rectangle {


    public static double areaofrect(double a, double b) {

        return a * b;
    }

    public static double areaofrect(double a) {

        return a * a;

    }

    public static void main(String[] args){
        double area;

        area = areaofrect(4,5);
        System.out.println(area);

        area = areaofrect(6);
        System.out.println(area);
    }
}