/*
Name: Edward Ornelas
Date: July 24, 2023
Assignment Name: Project 1: Warm-Ups
Assignment Description: In this assignment, I developed a program that prints the multiplication table of a given number. It uses a loop to iterate from 1 to 10 and perform multiplication with the input number. Through this, I practiced using loops, user input, and string formatting in Java.
Collaborators: This project was accomplished without direct collaboration from others. I referenced W3Schools for Java syntax guidelines: https://www.w3schools.com/java/java_syntax.asp
*/

import java.util.Scanner;

public class p1w2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input a number: ");
        int num = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }
}
