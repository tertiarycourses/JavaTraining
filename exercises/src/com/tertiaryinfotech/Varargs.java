package com.tertiaryinfotech;

public class Varargs {

    public static int add (int ...numbers) {

        int sum = 0;

        for (int i =0;i<numbers.length;i++) {
            sum = sum + numbers[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        int a;

        a = add(1,2,3,4,5,6,7,8,9,10);

        System.out.println(a);
    }
}
