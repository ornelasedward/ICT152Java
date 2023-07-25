/*
Name: Edward Ornelas
Date: July 24, 2023
Assignment Name: Project 1: Warm-Ups
Assignment Description: In this assignment, I wrote a Java program that prompts the user to enter a value and then prints all the odd numbers from 1 up to that value. The program uses a for loop and an increment of 2 to ensure only odd numbers are printed. This assignment helped me reinforce my understanding of for loops, user input, and the concept of odd and even numbers in programming.
Collaborators: This project was accomplished without direct collaboration from others. I referenced W3Schools for Java syntax guidelines: https://www.w3schools.com/java/java_syntax.asp
*/

import java.util.Scanner;

public class p1w4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a value: ");
        int value = input.nextInt();

        for (int i = 1; i <= value; i += 2) {
            System.out.println(i);
        }
    }
}
