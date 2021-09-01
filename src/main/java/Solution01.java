/*
 *  UCF COP3330 Fall 2021 Motivated Exercises 1, exercise01 Solution01
 *  Copyright 2021 Juan Guarnizo
 */

/*
* Pseudocode
*
* prompt the user: "What is your name?"
*
* create string name variable.
*
* make the string name save the user's input.
*
* create string output that says: "Hello, name, nice to meet you.
*
* print the string output to the user.
*
*
* */


import java.util.Scanner;

public class Solution01 {

    public static void main(String[] args) {

        System.out.println("What is your name? ");

        Scanner input = new Scanner(System.in);

        String name = input.nextLine();

        String output = "Hello, " + name + ", nice to meet you!";

        System.out.printf("%s", output);
    }

}
