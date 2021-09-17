/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Telleria
 */

import java.util.Scanner;

/*
Ask dimensions
    Prompt the user "What is the length of the room in feet?"
        save input into <length>
    Prompt the user "What is the width of the room in feet?"
        save input into <width>
    Print "You entered dimensions of <length> feet by <width> feet."
Calculate area in feet
    Print "The area is"
    Calculate <area> = <length> * <width>
    Print "<areaFeet> square feet"
Convert feet to meters
    Convert <areaFeet> from feet to meters <areaMeters>
    Print "<areaMeters> square meters"
*/
public class Solution07 {
    private static final Scanner input = new Scanner(System.in);
    private static final double conversion = 0.09290304;

    public static int askAreaDimensions(){
        System.out.printf("What is the length of the room in feet? ");
        int length = input.nextInt();
        System.out.printf("What is the width of the room in feet? ");
        int width = input.nextInt();
        System.out.printf("You entered dimensions of %d feet by %d feet.%n", length, width);
        return calcAreaFeet(length,width);
    }

    public static int calcAreaFeet(int length, int width){
        System.out.printf("The area is%n");
        int areaFeet = length * width;
        System.out.printf("%d square feet%n", areaFeet);
        return areaFeet;
    }

    public static void convertFeetToMeters(int areaFeet){
        double areaMeters = (double) areaFeet * conversion;
        System.out.printf("%.3f square meters", areaMeters);
    }

    public static void main(String[] args) {
        int areaFeet = askAreaDimensions();
        convertFeetToMeters(areaFeet);
    }
}
