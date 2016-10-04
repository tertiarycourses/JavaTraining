package com.tertiaryinfotech;



public class FTEmployee extends Employee {

    int leave;

    FTEmployee (String name, double salary) {
        super(name,salary);
       this.leave = leave;
    }

//    public void displayEmpDetails() {
//        System.out.printf("%s salary is %.0f and leave is %d",this.name, this.salary,this.leave);
//    }


    public static void main(String[] args) {
        FTEmployee emp1 = new FTEmployee("Ally",5000);

        emp1.displayEmpDetails();
    }

}


