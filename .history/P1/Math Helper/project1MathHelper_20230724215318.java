import java.util.Scanner;

public class project1MathHelper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice;
        double num1, num2, result;
        int start, end;

        do {
            System.out.println("\nChoose an option");
            System.out.println("A. Addition");
            System.out.println("B. Subtraction");
            System.out.println("C. Multiplication");
            System.out.println("D. Division");
            System.out.println("E. Odd/Even");
            System.out.println("F. other Calculations");
            System.out.println("G. Exit");

            choice = input.next().toUpperCase();

            switch (choice) {
                case "A":
                    System.out.println("Enter two numbers: ");
                    num1 = input.nextDouble();
                    num2 = input.next
            }

        }
    }
}