package com.tertiaryinfotech;
import java.util.Scanner;

public class Discount {

    public static void main(String[] args) {
        double totalSale = 0;
        double discount = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter total for the sale: ");
        totalSale = in.nextDouble();
        if(totalSale < 200)
        {
            discount = 0;
        }
        else if(totalSale < 500)
        {
            discount = 0.1;
        }
        else
        {
            discount = 0.2;
        }
        System.out.println("Total cost for your sale is: "+totalSale*(1-discount));



    }
}
