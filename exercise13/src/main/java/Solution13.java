/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Telleria
 */

import java.text.NumberFormat;
import java.util.Scanner;

/*
Prompt the user "What is the principal amount?"
    save input into <principal>
Prompt the user "What is the rate?"
    save input into <rateInterest>
Prompt the user "What is the number of years?"
    save input into <years>
Prompt the user "What is the number of times the interest is compounded per year?"
    save input into <numberCompoundedPerYear>
<AmountInvestment> = <principal>(1+(<rateInterest>/<numberCompoundedPerYear>))^(<numberCompoundedPerYear> * <years>)
 Print <principal> invested at <rateInterest>% for <years> years compounded <numberCompoundedPerYear> times per year is <amountInvestment>
 */
public class Solution13 {
    private static final Scanner input = new Scanner(System.in);

    public static double getPrincipal(){
        System.out.print("What is the principal amount? ");
        return input.nextDouble();
    }

    public static double getRateInterest(){
        System.out.print("What is the rate? ");
        return input.nextDouble();
    }

    public static int getYears(){
        System.out.print("What is the number of years? ");
        return input.nextInt();
    }

    public static int getNumberCompoundedPerYear(){
        System.out.print("What is the number of times the interest is compounded per year? ");
        return input.nextInt();
    }

    public static void calcAmountInvestment(double principal, double rateInterest, int years, int numberCompoundedPerYear){
        double amountInvestment = principal * Math.pow(1+((rateInterest/100)/numberCompoundedPerYear), numberCompoundedPerYear * years);
        System.out.printf("%s investment at %.1f%% for %d years compounded %d times per year is %s.",
                NumberFormat.getCurrencyInstance().format(principal), rateInterest, years, numberCompoundedPerYear,
                NumberFormat.getCurrencyInstance().format(Math.ceil(amountInvestment*100)/100));
    }

    public static void main(String[] args) {
        double principal = getPrincipal();
        double rateInterest = getRateInterest();
        int years = getYears();
        int numberCompoundedPerYear = getNumberCompoundedPerYear();
        calcAmountInvestment(principal, rateInterest, years, numberCompoundedPerYear);
    }
}
