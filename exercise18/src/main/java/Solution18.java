/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Telleria
 */

import java.util.Scanner;

/*
Prompt the user "Press C to convert from Fahrenheit to Celsius.
                Press F to convert from Celsius to Fahrenheit.
                Your choice:"
    save the input into <conversion>
If <conversion> = F or f
    Prompt the user "Please enter the temperature in Celsius:"
        save input into <temp>
        <temp> = (<temp> × 9 / 5) + 32
        Print "The temperature in Fahrenheit is <temp>"
If <conversion = C or c
    Prompt the user "Please enter the temperature in Fahrenheit:"
        save input into <temp>
        <temp> = (<temp> − 32) × 5 / 9
        Print "The temperature in Celsius is <temp>"
 */
public class Solution18 {
    private static final Scanner input = new Scanner(System.in);

    public static String getConversion(){
        System.out.printf("Press C to convert from Fahrenheit to Celsius.%nPress F to convert from Celsius to Fahrenheit.%nYour choice: ");
        return input.nextLine();
    }

    public static void toFahrenheit(){
        System.out.print("Please enter the temperature in Celsius: ");
        double temperature = input.nextDouble();
        temperature = (temperature * 9 / 5) + 32;
        System.out.printf("The temperature in Fahrenheit is %.1f.", temperature);

    }

    public static void toCelsius(){
        System.out.print("Please enter the temperature in Fahrenheit: ");
        double temperature = input.nextDouble();
        temperature = (temperature - 32) * 5/9;
        System.out.printf("The temperature in Celsius is %.1f.", temperature);
    }
    public static void main(String[] args) {
        String conversion = getConversion();
        if(conversion.equals("F") || conversion.equals("f")){
            toFahrenheit();
        }
        if(conversion.equals("C") || conversion.equals("c")){
            toCelsius();
        }
    }
}
