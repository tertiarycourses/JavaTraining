package com.tertiaryinfotech;


public class AA {


    public static void main(String[] args){

        Duck duck1 = new Duck("donald");

        duck1.talk();
        duck1.walk();
    }

    public static class Duck {

        String name;

        public Duck(String name) {
            this.name = name;
        }

        public void talk(){
            System.out.println(this.name + " talk like a duck");
        }

        public void walk() {
            System.out.println(this.name + " walk like a duck");
        }
    }
}
