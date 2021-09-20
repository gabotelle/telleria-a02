/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Telleria
 */

import java.util.Scanner;

/*
Prompt the user "What is your height in inches?"
    save input into <height>
Prompt the user "What is your weight in pounds?"
    save input into <weight>
<bmi> = (weight / (height * height)) * 703
Print "Your BMI is <bmi>"
if <bmi> < 18.5
    Print "You are underweight. You should see your doctor."
if <bmi> > 25
    Print "You are overweight. You should see your doctor."
else
    Print "You are within the ideal weight range"
 */
public class Solution19 {
    private static final Scanner input = new Scanner(System.in);

    public static double getHeight(){
        System.out.print("What is your height in inches? ");
        while(!input.hasNextDouble()){
            System.out.print("What is your height in inches?");
            input.next();
        }
        return input.nextDouble();
    }

    public static double getWeight(){
        System.out.print("What is your weight in pounds? ");
        while(!input.hasNextDouble()){
            System.out.print("What is your weight in pounds?");
            input.next();
        }
        return input.nextDouble();
    }

    public static void calcBMI(double height, double weight){
        double bmi = (weight / (height * height)) * 703;
        System.out.printf("Your BMI is %.1f.%n", bmi);
        if(bmi < 18.5){
            System.out.print("You are underweight. You should see your doctor.");
        }
        if(bmi > 25){
            System.out.print("You are overweight. You should see your doctor.");
        }
        else{
            System.out.print("You are within the ideal weight range");
        }
    }
    public static void main(String[] args) {
        double weight = getWeight();
        double height = getHeight();
        calcBMI(height, weight);
    }
}
