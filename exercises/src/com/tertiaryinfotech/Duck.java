package com.tertiaryinfotech;

public class Duck {

    String name;

    Duck(String name) {
        this.name = name;
    }
    public void walk() {
        System.out.println(this.name + " walk like a duck");
    }

    public void talk(){
        System.out.println(this.name + " quaaaak");
    }

    public static void main(String[] arg){
        Duck duck1 = new Duck("donald");

        duck1.walk();
        duck1.talk();
    }
}

