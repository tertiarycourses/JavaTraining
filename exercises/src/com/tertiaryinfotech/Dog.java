package com.tertiaryinfotech;

class Animal {

    String name;

    Animal(String name) {
        this.name = name;
    }

    public void walk() {
        System.out.println(" walk like an animal");
    }

    public void talk(){
        System.out.println(" talk like an animla");
    }

}
public class Dog extends Animal {

    Dog(String name){
        super(name);
    }


    public void talk(){
        System.out.println(this.name + " wooooooof");
    }

    public static void main(String[] arg){
        Dog dog1 = new Dog("fido");

        dog1.walk();
        dog1.talk();
    }
}
