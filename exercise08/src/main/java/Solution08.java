/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Telleria
 */

import java.util.Scanner;

/*
Prompt the user "How many people?"
    save input into <people>
Prompt the user "How many pizzas do you have?"
    save input into <pizzas>
Prompt the user "How many slices per pizza?4"
    save <slices> = <pizzas> * <input>
Print "<people> people with <pizzas> pizzas (<slices> slices)"
<slicesPerPerson> = <slices> / <people>
Print "Each person gets <slicesPerPerson> pieces of pizza."
<leftover> = <slices> % <people>
Print "There are <leftover> leftover pieces."
 */
public class Solution08 {
    private static final Scanner input = new Scanner(System.in);

    public static void calcSlices(){
        System.out.print("How many people? ");
        int people  = input.nextInt();
        System.out.print("How many pizzas do you have? ");
        int pizzas  = input.nextInt();
        System.out.print("How many slices per pizza? ");
        int slices = pizzas * input.nextInt();
        System.out.printf("%d people with %d pizzas (%d slices)%n", people, pizzas, slices);
        calcSlicesPerPerson(slices, people);
    }

    public static void calcSlicesPerPerson(int slices, int people){
        int slicesPerPerson = slices / people;
        System.out.printf("Each person gets %d pieces of pizza.%n", slicesPerPerson);
        int leftover = slices % people;
        System.out.printf("There are %d leftover pieces.", leftover);
    }
    public static void main(String[] args) {
        calcSlices();
    }
}
