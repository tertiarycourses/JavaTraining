package com.tertiaryinfotech;

public class Ternary {

    public static void main(String[] args) {

        int total_orders = 200;
        int discount;

        discount = (total_orders > 100) ? 25 : 0;

        System.out.println("discount = " + discount);
    }
}
