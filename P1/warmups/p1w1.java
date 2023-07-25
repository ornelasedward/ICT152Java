/*
Name: Edward Ornelas
Date: July 24, 2023
Assignment Name: Project 1: Warmup #1: Simple Calculator
Assignment Description: In this assignment, I developed a basic Java program that performs various arithmetic operations such as addition, subtraction, multiplication, division, and modulus. I also practiced using Java's Scanner class for user input. Through this assignment, I learned the fundamental aspects of Java syntax and user interaction.
Collaborators: This project was accomplished without direct collaboration from others. I referenced W3Schools for Java syntax guidelines: https://www.w3schools.com/java/java_syntax.asp
*/

import java.util.Scanner;

public class p1w1 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Input first number: ");
        int num1 = scnr.nextInt();

        System.out.println("Input second number: ");
        int num2 = scnr.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + difference);
        System.out.println(num1 + " x " + num2 + " = " + product);
        System.out.println(num1 + " / " + num2 + " = " + quotient + " remainder of " + remainder);

    }
}