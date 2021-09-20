/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Telleria
 */

import java.util.Scanner;

/*
Prompt the user "Enter the first number:"
    save input into <number1>
Prompt the user "Enter the second number:"
    save input into <number2>
Prompt the user "Enter the third number:"
    save input into <number3>
if number1 > number2 and number3
     The largest number is <number1>
if number2 > number1 and number3
     The largest number is <number2>
else
    The largest number is <number3>
 */
public class Solution22 {
    private static final Scanner input = new Scanner(System.in);

    public static void getNumbers(){
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = input.nextInt();
        calcLargest(number1, number2, number3);
    }

    public static void calcLargest(int number1, int number2, int number3){
        if(number1 >= number2 && number1 >= number3){
            System.out.printf("The largest number is %d.", number1);
        }
        else if(number2 >= number1 && number2 >= number3){
            System.out.printf("The largest number is %d.", number2);
        }
        else{
            System.out.printf("The largest number is %d.", number3);
        }
    }
    public static void main(String[] args) {
        getNumbers();
    }
}
