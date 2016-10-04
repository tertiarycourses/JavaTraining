package com.tertiaryinfotech;

public class StringDemo {


    public static void main(String[] args) {


        String a = "Hello ";
        String b = "World";
        String c = a + b;

        System.out.println(c);

        //String d = "Alfred";
        // System.out.printf("My name is %s\n",d);

        System.out.println(c.toUpperCase());

        c = "    Hello    World     ";
        System.out.println(c.trim());

        System.out.printf("The length the string is %d\n",c.length());





    }

}
