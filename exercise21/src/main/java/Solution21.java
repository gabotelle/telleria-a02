/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Telleria
 */

import java.util.Scanner;

/*
Prompt the user "Please enter the number of the month"
    save input into <month>
if <month> = 1
Print "The name of the month is january."
if <month> = 2
Print "The name of the month is February."
if <month> = 3
Print "The name of the month is March."
if <month> = 4
Print "The name of the month is April."
if <month> = 5
Print "The name of the month is May."
if <month> = 6
Print "The name of the month is June."
if <month> = 7
Print "The name of the month is July."
if <month> = 8
Print "The name of the month is August."
if <month> = 9
Print "The name of the month is September."
if <month> = 10
Print "The name of the month is October"
if <month> = 11
Print "The name of the month is November"
if <month> = 12
Print "The name of the month is December."

 */
public class Solution21 {
    private static final Scanner input = new Scanner(System.in);

    public static String getMonth(){
        System.out.print("Please enter the number of the month: ");
        int month = input.nextInt();
        String monthName;
        switch(month){
            case 1: monthName = "January";
                    break;
            case 2: monthName = "February";
                    break;
            case 3: monthName = "March";
                    break;
            case 4: monthName = "April";
                    break;
            case 5: monthName = "May";
                    break;
            case 6: monthName = "June";
                    break;
            case 7: monthName = "July";
                    break;
            case 8: monthName = "August";
                    break;
            case 9: monthName = "September";
                    break;
            case 10: monthName = "October";
                    break;
            case 11: monthName = "November";
                    break;
            case 12: monthName = "December";
                    break;
            default: monthName = "NOT FOUND";
                    break;
        }
        return monthName;
    }
    public static void main(String[] args) {
        System.out.printf("The name of the month is %s.", getMonth());
    }
}
