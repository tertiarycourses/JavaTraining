package com.tertiaryinfotech;

public class InstanceVariable {

    int puppyAge;

    public void setAge(int age) {

        puppyAge = age;
    }

    public void getAge() {
        System.out.println("Puppy's age is :" + puppyAge);
    }

    public static void main(String args[]){
        InstanceVariable puppy1 = new InstanceVariable();
        InstanceVariable puppy2 = new InstanceVariable();

        puppy1.setAge(2);
        puppy2.setAge(5);

        puppy1.getAge();
        puppy2.getAge();
    }

}
