package com.tertiaryinfotech;

public class Break {

    public static void main(String args[]) {

        int [] numbers = {10, 20, 30, 40, 50};

        for(int x : numbers ) {
            if( x == 30 ) {
                break;
            }
            System.out.println( x );
        }
    }
}

