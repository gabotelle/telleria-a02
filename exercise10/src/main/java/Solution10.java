/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Telleria
 */

import java.text.NumberFormat;
import java.util.Scanner;

/*
Calculate subtotal
    Ask the user 3 times:
        Prompt "Enter the price of item <itemNumber>:"
            Save input into <price>
        Prompt "Enter the quantity of item:"
            Save input into <quantity>
        <subtotal> = <subtotal> + (<quantity> * <price>)
Print total
    Print "Subtotal: <subtotal>"
    <tax> = <subtotal> * 0.055
    Print "Tax: <tax>"
    Print "Total: (<total> + <tax>)"
 */
public class Solution10 {
    private static final Scanner input = new Scanner(System.in);

    public static int calcSubtotal(){
        int subtotal = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.printf("Enter the price of item %d: ", i);
            int price = input.nextInt();
            System.out.printf("Enter the quantity of item %d: ", i);
            int quantity = input.nextInt();
            subtotal += (price * quantity);
        }
        return subtotal;
    }

    public static void printTotal(int subtotal){
        String subtotalString = "Subtotal: " + NumberFormat.getCurrencyInstance().format(subtotal);
        System.out.println(subtotalString);
        double tax = subtotal * 0.055;
        String taxString = "Tax: " + NumberFormat.getCurrencyInstance().format(tax);
        System.out.println(taxString);
        String totalString = "Total: " + NumberFormat.getCurrencyInstance().format(subtotal + tax);
        System.out.println(totalString);
    }

    public static void main(String[] args) {
        int subtotal = calcSubtotal();
        printTotal(subtotal);
    }
}
