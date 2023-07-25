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