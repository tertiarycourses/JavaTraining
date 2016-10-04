package com.tertiaryinfotech;

public class Triangle {

    double base, height;

    Triangle(double base, double height) {

        this.base = base;
        this.height = height;

    }

    public void area() {
        double area = this.base * this.height;
        System.out.println(area);
    }

    public static void main(String[] args) {

        Triangle tri = new Triangle(4,6);

        tri.area();
    }

}
