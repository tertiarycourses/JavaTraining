package com.tertiaryinfotech;


public class Switch {

    public static void main(String args[]){
        char grade = 'C';

        switch(grade)
        {
            case 'A' :
                System.out.println("Excellent!");
                break;
            case 'B' :
                System.out.println("Well done");
                break;
            case 'C' :
                System.out.println("Good work");
                break;
            case 'D' :
                System.out.println("Work Harder");
                break;
            case 'F' :
                System.out.println("Better try again");
                break;
            default :
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);
    }

}
