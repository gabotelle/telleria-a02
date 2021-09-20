/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Telleria
 */

import java.util.Scanner;

/*

 */
public class Solution21 {
    private static final Scanner input = new Scanner(System.in);

    public static String getMonth(){
        System.out.print("Please enter the number of the month");
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
