/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Telleria
 */

import java.util.Scanner;

/*
Prompt the user "What is your age?"
    save inout into <userAge>
if <userAge> >= 16
    Print "You are old enough to legally drive."
else
    Print "You are not old enough to legally drive."
 */
public class Solution16 {
    private static final Scanner input = new Scanner(System.in);

    public static int getUserAge(){
        System.out.print("What is your age? ");
        return input.nextInt();
    }

    public static String checkAge(int age){
        return (age>=16) ? "You are old enough to legally drive." : "You are not old enough to legally drive.";
    }
    public static void main(String[] args) {
        System.out.print(checkAge(getUserAge()));
    }
}
