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
Calculate ceiling area
    <area> = <length> * <width>
Calculate gallons needed
    <gallons> = <area> / <conversion>
    Print "You need to purchase <gallons> gallons of paint to cover <area> square feet."
 */
public class Solution09 {
    private static final Scanner input = new Scanner(System.in);
    private static final int conversion = 350;

    public static int askAreaDimensions(){
        System.out.print("What is the length of the room in feet? ");
        int length = input.nextInt();
        System.out.print("What is the width of the room in feet? ");
        int width = input.nextInt();
        return calcArea(length,width);
    }

    public static int calcArea(int length, int width){
        int area = length * width;
        System.out.printf("%d square feet%n", area);
        return area;
    }

    public static void calcGallons(int area){
        int gallons = (int)Math.ceil((double)area / conversion);
        System.out.printf("You need to purchase %d gallons of paint to cover %d square feet.", gallons, area);
    }
    public static void main(String[] args) {
        int area = askAreaDimensions();
        calcGallons(area);
    }
}
