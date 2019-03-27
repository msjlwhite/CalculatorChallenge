/*
Date: 03/26/2019
Author: J White
Task: Simple Calculator application
======================
In this application you will create a **Calculator Class** with no fields
and five methods.

- void displayMenu()    // Prompts the user to enter an operation type
- void add() 		    // takes in two values and adds them together
- void subtract() 	    // takes in two values and subtracts the second value from the first
- void multiply() 		// takes in two values and adds them together
- void divide() 		// takes in two values and divides the first value by the second

upon starting the application prompt the user to enter in the operation
each operation will take an input of two values (val1, val2).

Extra credit if you can account for more than two values.

*/

// original version
package com.company;

// imports the class file that the application needs to run
import com.company.CalculatorChallenge;

public class Main {

    // main program take in user input and to trigger the methods to handle computations
    public static void main(String[] args) {

        // call the displayMenu method upon starting the application
        CalculatorChallenge calculator = new CalculatorChallenge();
        calculator.displayMenu();

    } // End of main() Method



} // End of Class--Main
