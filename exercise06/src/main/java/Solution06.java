/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Telleria
 */

import java.util.Calendar;
import java.util.Scanner;

/*
Ask current age
    Prompt the user "What is your current age?"
        save into 'currentAge'
Ask age to retire
    Prompt the user "At what age would you like to retire?
        save into 'retireAge'
Calculate retire year
    set <yearsLeft> = retireAge-retireAge
    output "You have <yearsLeft> years left until you can retire."
    output "It's <currentYear>, so you can retire <currentYear + yearsLeft>."
 */
public class Solution06 {
    private static final Scanner input = new Scanner(System.in);

    public static int askCurrentAge(){
        System.out.printf("What is your current age? ");
        return input.nextInt();
    }

    public static int askRetireAge(){
        System.out.printf("At what age would you like to retire? ");
        return input.nextInt();
    }

    public static void calcRetireYear(int yearsLeft){
        System.out.printf("You have %d years left until you can retire.%n", yearsLeft);
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        System.out.printf("It's %d, so you can retire in %d.", currentYear, currentYear+yearsLeft);
    }

    public static void main(String[] args) {
        int currentAge = askCurrentAge();
        int retireAge = askRetireAge();
        int yearsLeft = retireAge - currentAge;
        calcRetireYear(yearsLeft);
    }
}

