/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Eric Heston
 */

/*
  prompt the user for a string
  get input from user using they keyboard
  determine how many characters the string has
  print out the original string and how many characters it has

  set up a scanner
  create a new scanner using the keyboard system.in
  use print statement to prompt user for input string
  use nextLine to get the input from the user and store it in variable string
  print final message showing input string and saying how many characters
    -use string length function to get number of characters (can be used inside print statement)
 */

import java.util.Scanner; //imports scanner

public class Solution02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("What is the input string? ");
        String string = input.nextLine();
        System.out.println(string + " has " +string.length() + " characters." );

    }
}
