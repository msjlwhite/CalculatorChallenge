
/*
Date: 03/26/2019
Author: J White
class needed for the main

 */


package com.company;

// imports the scanner library that the application needs to run
import java.text.Format;
import java.util.Scanner;
import java.util.*;

// final version
public class CalculatorChallenge {

    // object declaration and initialization
    // Instance variable declaration for the calculator challenge class
    String optType;     // variable to hold the user's math operation choice
    double v1;          // variable to hold first number entered
    double v2;          // variable to hold second number entered
    double solution;    // the answer to the user's mathimatical query
    double select;

    // displays the program options to the user
    public void displayMenu() {
        do {
            // App welcome message to user
            System.out.println("Welcome to the Math Magical Calculadora!");
            System.out.println("");

            // Displays the User's calculator options main menu
            Scanner scanner1 = new Scanner(System.in);

            // Prompts the user to enter an operation type
            System.out.println("Please choose from the following options: ");
            System.out.println("1 -- Addition");
            System.out.println("2 -- Subtraction");
            System.out.println("3 -- Multiplication");
            System.out.println("4 -- Division");
            System.out.println("0 -- Exit Application");

            System.out.println("");
            System.out.print("Please enter option here: ");

            // switch case to loop through the program and user selection
            optType = scanner1.nextLine();
            switch (Integer.parseInt(optType)) {
                case 1: // takes in two values and adds them together

                    add();
                    break;
                case 2: // takes in two values and subtracts the second value from the first
                    subtract();
                    break;
                case 3: // takes in two values and multiplies the first value by the second (P.S. Yo Yo Yo, JoAnna wrote this CODE!! Twin OUT!!!!!)
                    multiply();
                    break;
                case 4: // takes in two values and divides the first value by the second
                    divide();
                    break;
                default: thankYou();
                    break;
            } // end of switch

        } //  end of do loop

        // will continue to run the program until the user enters in 0 to exit
        while (Integer.parseInt(optType) != 0);


    } // end of displayMenu() Method

    public void getNums() {

        // PLEASE NOTE -- that all credit for the function idea and placement goes to Stephen Scruggs. I tip my hat to you Stephen!

        System.out.println("");
        System.out.print("Please enter in your first number: ");
        Scanner value1 = new Scanner(System.in);
        v1 = value1.nextDouble();

        System.out.print("Please enter in your second number: ");
        Scanner value2 = new Scanner(System.in);
        v2 = value2.nextDouble();

    } // end of getNums() Method


    // takes the two values entered then adds them together
    public void add() {

        // calls the input() method to ask for and take in input given by the user
        getNums();

        // adds the values together to get the answer
        solution = v1 + v2;

        // checks to see if the solution should display as a whole number or decimal point
        // prints out the answer -- whole number comparison
        if (solution == Math.round(solution))
        {
            System.out.println(Math.round(solution));
        }

        else {
             System.out.println(String.format("%.02f",solution));
        }

        // prints solution then gives the user a joke (funny ha ha)
        System.out.println(solution);
        System.out.println("Q: What snakes are good at doing sums?");
        System.out.println("A: Adders (the sum is what you get when you add numbers)");
        System.out.println("");
    } // end of add() Method

    // takes the two values entered then subtracts the first from the last
    public void subtract() {
        // calls the input() method to ask for and take in input given by the user
        getNums();

        // subtracts one of the values from the other to get the answer
        solution = v1 - v2;

        // checks to see if the solution should display as a whole number or decimal point
        // prints out the answer -- whole number comparison
        if (solution == Math.round(solution))
        {
            System.out.println(Math.round(solution));
        }

        else
            {
            System.out.println(String.format("%.02f",solution));

        }

        // prints solution then gives the user a joke (funny ha ha)
        System.out.println(solution);
        System.out.println("Math Joke: I was going to tell you a joke about subtraction but I didn’t want you to think less of me.");
        System.out.println("");

    } // end of subtract() Method

    // takes the two values entered then multiplies them together
    public void multiply() {

        // calls the input() method to ask for and take in input given by the user
        getNums();

        // multiplies the values together to get the answer
        solution = v1 * v2;

        // checks to see if the solution should display as a whole number or decimal point
        // prints out the answer -- whole number comparison
        if (solution == Math.round(solution))
        {
            System.out.println(Math.round(solution));
        }

        else
        {
            System.out.println(String.format("%.02f",solution));

        }

        // prints solution as a double then gives the user a joke (funny ha ha)
        System.out.println(solution);
        System.out.println("Q. Where do multiplication problems eat breakfast?");
        System.out.println("A: At times tables.");
        System.out.println("");

    } // end of multiply() Method

    // takes the two values entered then divides the first by the second
    public void divide() {

        // calls the input() method to ask for and take in input given by the user
        getNums();

        // divides the numbers by one another to get the answer
        solution = v1 / v2;

        // checks to see if the solution should display as a whole number or decimal point
        // prints out the answer -- whole number comparison
        if (solution == Math.round(solution))
        {
            System.out.println(Math.round(solution));
        }

        else
        {
            System.out.println(String.format("%.02f",solution));

        }

        // prints solution then gives the user a joke (funny ha ha)
        System.out.println(solution);
        System.out.println("Why did I divide sin by tan?");
        System.out.println("Just cos.");
        System.out.println("");

    } // end of divide() Method

    // takes the two values entered then adds them together
    public void thankYou() {

        // displays a thank you message to the user as the program closes
        System.out.println("Math Joke of the Day:");
        System.out.println("Q: What do you call an angle that is adorable?");
        System.out.println("A: Acute angle.");
        System.out.println("Thank You for using the Math Magical Calculadora! Have Yourself a Math Magical Day!");
        System.out.println("==================");

    }// end of thankYou() Method

} // end of CalculatorChallenge class