/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Telleria
 */

import java.util.Scanner;

/*

 */
public class Solution23 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Is the car silent when you turn the key? ");
        String answer = input.nextLine();
        if(answer.equals("y")){
            System.out.print("Are the battery terminals corroded? ");
            answer = input.nextLine();
            if(answer.equals("y")){
                System.out.print("Clean terminals and try starting again.");
            }
            else{
                System.out.print("Replace cables and try again.");
            }
        }
        else{
            System.out.print("Does the car make a slicking noise? ");
            answer = input.nextLine();
            if(answer.equals("y")){
                System.out.print("Check spark plug connections.");
            }
            else{
                System.out.print("Does the engine start and then die? ");
                answer = input.nextLine();
                if(answer.equals("y")){
                    System.out.printf("Does you car have fuel injection? ");
                    answer = input.nextLine();
                    if(answer.equals("y")){
                        System.out.print("Get it in for service.");
                    }
                    else{
                        System.out.print("Check to ensure the choke is opening and closing.");
                    }
                }
                else{
                    System.out.print("This should not be possible.");
                }
            }
        }
    }
}
