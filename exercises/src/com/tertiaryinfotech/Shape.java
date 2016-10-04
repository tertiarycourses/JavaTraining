package com.tertiaryinfotech;

public class Shape {

    double width;
    double length ;

    Shape(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public void area () {
        System.out.println(this.width *this.length);
    }

    public void perimeter() {
        System.out.println(2*(this.width+this.length));
    }

public static void main(String[] arg) {
    Shape s = new Shape(3,5);
    Shape s2 = new Shape(6,7);

    s.area();
    s.perimeter();

    s2.area();
    s2.perimeter();
}
}