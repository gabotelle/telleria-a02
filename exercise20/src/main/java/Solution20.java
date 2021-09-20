/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Telleria
 */

import java.text.NumberFormat;
import java.util.Scanner;

/*
Prompt the user "What is the order amount?"
    save the input i"nto <amount>
Prompt the user "What state do you live in?"
    save the input into <state>
If <state> equals Wisconsin
    <tax> = .05
    Prompt the user "What county do you live in?"
        save the input into <county>
    if <county> equals Eau Claire
        <tax> = <tax> +.005
    if <county> equals Dunn
        <tax> = <tax> +.004
    print "The subtotal is <amount>."
    <tax> = <amount> * .055
    print "The tax is <tax>."
    <amount> = <amount> + <tax>
if <state> equals Illinois
    <tax> = 0.08
    print "The subtotal is <amount>."
    <tax> = <amount> * .055
    print "The tax is <tax>."
    <amount> = <amount> + <tax>
Print "The total is <amount>"
 */
public class Solution20 {
    private static final Scanner input = new Scanner(System.in);

    public static double getAmount(){
        System.out.print("What is the order amount? ");
        return input.nextDouble();
    }

    public static String getState(){
        System.out.print("What state do you live in? ");
        input.nextLine();
        return input.nextLine();
    }

    public static String getCounty(){
        System.out.print("What county do you live in? ");
        return input.nextLine();
    }

    public static double calcWI(double amount){
        double tax = .05;
        String county = getCounty();
        if(county.equals("Eau claire")){
            tax += .005;
        }
        else if(county.equals("Dunn")){
            tax += .004;
        }
        System.out.printf("The subtotal is %s.%n", NumberFormat.getCurrencyInstance().format(amount));
        tax = amount * tax;
        System.out.printf("The tax is %s.%n", NumberFormat.getCurrencyInstance().format(tax));
        return amount + tax;
    }

    public static double calcIL(double amount){
        System.out.printf("The subtotal is %s.%n", NumberFormat.getCurrencyInstance().format(amount));
        double tax = amount * .08;
        System.out.printf("The tax is %s.%n", NumberFormat.getCurrencyInstance().format(tax));
        return amount + tax;
    }

    public static void main(String[] args) {
        double amount = getAmount();
        String state = getState();
        if(state.equals("Wisconsin")){
            amount = calcWI(amount);
        }
        else if(state.equals("Illinois")){
            amount = calcIL(amount);
        }
        System.out.printf("The total is %s.", NumberFormat.getCurrencyInstance().format(amount));
    }
}
