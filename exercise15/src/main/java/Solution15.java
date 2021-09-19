/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Telleria
 */

import java.util.Scanner;

/*
Prompt the user "What is the username?"
    save input into <username>
Prompt the user "What is the password?"
    save input into <password>
if <password> equals <knownPassword>
    Print "Welcome!"
else
    Print "I don't know you."
 */
public class Solution15 {
    private static final Scanner input = new Scanner(System.in);

    private static final String knownPassword = "abc$123";

    public static void getUsername(){
        System.out.print("What is the username? ");
        input.nextLine();
    }

    public static String getPassword(){
        System.out.print("What is the password? ");
        return input.nextLine();
    }

    public static void checkPassword(String password){
        if(password.equals(knownPassword)){
            System.out.print("Welcome!");
        }
        else{
            System.out.print("I don't know you.");
        }
    }
    public static void main(String[] args) {
        getUsername();
        String password = getPassword();
        checkPassword(password);
    }

}
