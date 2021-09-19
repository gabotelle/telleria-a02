/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Telleria
 */

import java.util.Scanner;

/*
Prompt the user "Enter a 1 is you are male or a 2 if you are female:"
    if input equals 1
        <ratio> = 0.73
    if input equals 2
        <ratio> = 0.66
Prompt the user "How many ounces of alcohol did you have?"
    save input into <alcoholOunces>
Prompt the user "What is your weight, in pounds?"
    save input into <weight>
Prompt the user "How many hours has it been since your last drink?"
    save input into <hoursSinceLastDrink>
<bloodAlcohol> = (<alcoholOunces> * 5.14 / <weight> * <ratio>) - .015 * <hourSinceLastDrink>
 Print "Your BAC is <bloodAlcohol>"
 if <bloodAlcohol> >= 0.08
    print "It is not legal for you to drive."
else
    print "It is legal for you to drive."
 */
public class Solution17 {
    private static final Scanner input = new Scanner(System.in);

    public static double getGender(){
        System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
        while(!input.hasNextInt()){
            System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
            input.next();
        }
        int gender = input.nextInt();
        if(gender == 1){
            return 0.73;
        }
        else if(gender == 2){
            return 0.66;
        }
        else{
            System.out.printf("That is not a proper input!%n");
            return getGender();
        }
    }

    public static double getAlcoholOunces(){
        System.out.print("How many ounces of alcohol did you have? ");
        while(!input.hasNextDouble()){
            System.out.printf("Please enter a number!%nHow many ounces of alcohol did you have? ");
            input.next();
        }
        return input.nextDouble();
    }

    public static double getWeight(){
        System.out.print("What is your weight, in pounds? ");
        while(!input.hasNextDouble()){
            System.out.printf("Please enter a number!%nWhat is your weight, in pounds? ");
            input.next();
        }
        return input.nextDouble();
    }

    public static double getHoursSinceLastDrink(){
        System.out.print("How many hours has it been since your last drink? ");
        while(!input.hasNextDouble()){
            System.out.printf("Please enter a number!%nHow many hours has it been since your last drink? ");
            input.next();
        }
        return input.nextDouble();
    }

    public static void calcBAC(double alcoholOunces, double weight, double ratio, double hoursSinceLastDrink){
        double bloodAlcohol = (alcoholOunces * 5.14 / weight * ratio) - 0.015 * hoursSinceLastDrink;
        System.out.printf("Your BAC is %.6f%n", bloodAlcohol);
        if(bloodAlcohol < 0.08){
            System.out.print("It is legal for you to drive.");
        }
        else{
            System.out.print("It is not legal for you to drive.");
        }
    }
    public static void main(String[] args) {
        double ratio = getGender();
        double alcoholOunces = getAlcoholOunces();
        double weight = getWeight();
        double hours = getHoursSinceLastDrink();
        calcBAC(alcoholOunces, weight, ratio, hours);
    }
}
