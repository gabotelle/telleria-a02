/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Telleria
 */

import java.text.NumberFormat;
import java.util.Scanner;

/*
Prompt the user "What is the order amount?"
    save the input i"nto <amount>
Prompt the user "What is the state?"
    save the input into <state>
If <state> equals WI
    print "The subtotal is <amount>."
    <tax> = <amount> * .055
    print "The tax is <tax>."
    <amount> = <amount> + <tax>
Print "The total is <amount>"
 */
public class Solution14 {
    private static final Scanner input = new Scanner(System.in);

    public static double getAmount(){
        System.out.print("What is the order amount? ");
        return input.nextDouble();
    }

    public static String getState(){
        System.out.print("What is the state? ");
        input.nextLine();
        return input.nextLine();
    }

    public static double calcWI(double amount){
        System.out.printf("The subtotal is %s.%n", NumberFormat.getCurrencyInstance().format(amount));
        double tax = amount * .055;
        System.out.printf("The tax is %s.%n", NumberFormat.getCurrencyInstance().format(tax));
        return amount + tax;
    }
    public static void main(String[] args) {
        double amount = getAmount();
        String state = getState();
        if(state.equals("WI")){
            amount = calcWI(amount);
        }
        System.out.printf("The total is %s.", NumberFormat.getCurrencyInstance().format(amount));
    }
}
