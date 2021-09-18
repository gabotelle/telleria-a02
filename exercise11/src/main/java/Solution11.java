/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Telleria
 */

/*
Prompt the user "How many euros are you exchanging?"
    save input into <euros>
Prompt the user "What is the exchange rate?"
    save input into <exchangeRate>
Print "<euros> euros at an exchange rate of <exchangeRate> is"
<dollars> = <euros> * <exchangeRate>
Print "<dollars> U.S. dollars.
 */

import java.util.Scanner;

public class Solution11 {
    private static final Scanner input = new Scanner(System.in);

    public static void askEurosToConvert(){
        System.out.print("How many euros are you exchanging? ");
        double euros = input.nextDouble();
        System.out.print("What is the exchange rate? ");
        double exchangeRate = input.nextDouble();
        System.out.printf("%.2f euros at an exchange rate of %.4f is%n", euros, exchangeRate);
        convertToDollars(euros, exchangeRate);
    }

    public static void convertToDollars(double euros, double exchangeRate){
        double dollars = Math.ceil(euros * exchangeRate * 100) / 100.0;
        System.out.printf("%.2f U.S. dollars.", dollars);
    }
    public static void main(String[] args) {
        askEurosToConvert();
    }
}
