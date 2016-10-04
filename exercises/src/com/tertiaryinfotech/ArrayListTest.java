package com.tertiaryinfotech;
import java.util.Scanner;
import java.util.ArrayList;


public class ArrayListTest {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> mylist = new ArrayList<Integer>();

        for (int i=0;i<5;i++) {
            System.out.println("Enter a number: ");
            mylist.add(in.nextInt());
        }

        int maxnum = 0;
        for (int s : mylist) {
            if (maxnum < s) maxnum = s;
            }
        System.out.println("Max number is "+maxnum);

    }

}
