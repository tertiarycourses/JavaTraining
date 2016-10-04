package com.tertiaryinfotech;

public class Puppy {

    int puppyAge;

    public void setAge( int age ){
        puppyAge = age;
    }

    public int getAge( ){
        puppyAge = puppyAge + 7;
        System.out.println("Puppy's age is :" + puppyAge );
        return puppyAge;
    }

    public static void main(String args[]){
        Puppy puggy1 = new Puppy();

        puggy1.setAge(2);
        puggy1.getAge();
    }
}
