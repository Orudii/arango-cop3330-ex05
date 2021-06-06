/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Rudy Arango
 */

package base;

/*
Exercise 5 - Simple Math
You’ll often write programs that deal with numbers. And depending on the programming language you use, you’ll have to convert the inputs you get to numerical data types.

Write a program that prompts for two numbers. Print the sum, difference, product, and quotient of those numbers as shown in the example output:

Example Output
What is the first number? 10
What is the second number? 5
10 + 5 = 15
10 - 5 = 5
10 * 5 = 50
10 / 5 = 2
Constraints
Values coming from users will be strings. Ensure that you convert these values to numbers before doing the math.
Keep the inputs and outputs separate from the numerical conversions and other processing.
Generate a single output statement with line breaks in the appropriate spots.
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2;


        System.out.print("What is the first number? ");
        num1 = in.nextInt();

        System.out.print("What is the second number? ");
        num2 = in.nextInt();

        System.out.println("" +num1+ " + " +num2+ " = " +(num1+num2)+ "\n" +num1+ " - " +num2+ " = " +(num1-num2)+ "\n" +num1+ " * " +num2+ " = " +(num1*num2)+ "\n" +num1+ " / " +num2+ " = " + (num1/num2));
    }
}
