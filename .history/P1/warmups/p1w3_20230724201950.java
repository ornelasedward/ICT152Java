/*
Name: Edward Ornelas
Date: July 24, 2023
Assignment Name: Project 1: Warm-Ups
Assignment Description: In this assignment, I developed a Java program that calculates and displays the perimeter and area of a circle, given its radius. The program prompts the user for the radius, and then calculates the perimeter and area using mathematical formulas. It then outputs the results with a precision of two decimal places. Through this assignment, I reinforced my understanding of user input, mathematical operations, and string formatting in Java.
Collaborators: This project was accomplished without direct collaboration from others. I referenced W3Schools for Java syntax guidelines: https://www.w3schools.com/java/java_syntax.asp
*/

import java.util.Scanner;

public class p1w3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        double radius = input.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.printf("Perimeter is = %.2f\n", perimeter);
        System.out.printf("Area is = %.2f\n", area);
    }
}