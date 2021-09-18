/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Telleria
 */

import java.text.NumberFormat;
import java.util.Scanner;

/*
Prompt the user "Enter the principal:"
    save input into <principal>
Prompt the user "Enter the rate of interest:"
    save input into <rateInterest>
Prompt the user "Enter the number of years:"
    save input into <years>
<amountInvestment> = <principal>(1 + <rateInterest> * <years>)
Print "After <years> years at <rateInterest>, the investment will be worth <amountInvestment>."
 */
public class Solution12 {
    private static final Scanner input = new Scanner(System.in);

    public static double getPrincipal(){
        System.out.print("Enter the principal: ");
        return input.nextDouble();
    }

    public static double getRateInterest(){
        System.out.print("Enter the rate of interest: ");
        return input.nextDouble();
    }

    public static int getYears(){
        System.out.print("Enter the number of years: ");
        return input.nextInt();
    }

    public static void calcAmountInvestment(double principal, double rateInterest, int years){
        double amountInvested = Math.ceil((principal * (1 + (rateInterest / 100) * (double)years) * 100) / 100.0);
        System.out.printf("After %d years at %.1f%%, the investment will be worth %s", years, rateInterest, NumberFormat.getCurrencyInstance().format(amountInvested));
    }
    public static void main(String[] args) {
        double principal = getPrincipal();
        double rateInterest = getRateInterest();
        int years = getYears();
        calcAmountInvestment(principal, rateInterest, years);
    }
}
