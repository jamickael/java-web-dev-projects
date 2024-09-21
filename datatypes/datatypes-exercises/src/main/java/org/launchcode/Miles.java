package org.launchcode;
import java.util.Scanner;

public class Miles {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        Double miles = input.nextDouble();
        System.out.println("How much gas have you consued (in gallons)?");
        Double gas = input.nextDouble();

        System.out.println("You're currently getting "+miles/gas + " mpg.");
    }
}
