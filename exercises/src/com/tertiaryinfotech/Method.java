package com.tertiaryinfotech;

public class Method {

    public static double areaofcircle(double r){
        double pi = 3.1415;
        return pi*r*r;
    }

    public static void main(String[] args){

        double a;

        a = areaofcircle(2.0);

        System.out.println("Area of cicle = " + a);
    }

}
