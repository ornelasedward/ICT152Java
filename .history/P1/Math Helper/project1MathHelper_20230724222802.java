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
                    num2 = input.nextDouble();
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;

                case "B":
                    System.out.println("Enter two numbers: ");
                    num1 = input.nextDouble();
                    num2 = input.nextDouble();
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;

                case "C":
                    System.out.println("Enter two numbers: ");
                    num1 = input.nextDouble();
                    num2 = input.nextDouble();
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;

                case "D":
                    System.out.println("Enter two numbers: ");
                    num1 = input.nextDouble();
                    num2 = input.nextDouble();
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero is undefined");
                    }
                    break;

                case "E":
                    System.out.println("Enter a starting and ending value: ");
                    start = input.nextInt();
                    end = input.nextInt();
                    System.out.println("Odd numbers: ");
                    for (int i = start; i <= end; i++) {
                        if (i % 2 != 0) {
                            System.out.print(i + " ");
                        }
                    }
                        System.out.println("\nEven numbers: ");
                    System.out.println("\nEven numbers: ");
                    for (int i = start; i <= end; i++) {
                        if (i % 2 == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    break;

                    case "F":
                    System.out.println("1. Calculate Area of a Circle");
                    System.out.println("2. Calculate Perimeter of a Rectangle");
                    System.out.println("4. Calculate Power");
                    int option = input.nextInt();
                    switch (option) {
                        case 1:
                            System.out.println("Enter radius of the circle:");
                            num1 = input.nextDouble();
                            result = Math.PI * num1 * num1;
                            System.out.println("Area: " + result);
                            break;
                    }
                        case 2:
                            System.out.println("Enter radius of the circle:");
                            num1 = input.nextDouble();
                            result = Math.PI * num1 * num1;
                            System.out.println("Area: " + result);
                            break;

                        case 3:
                            System.out.println("Enter radius of the circle:");
                            num1 = input.nextDouble();
                            result = Math.PI * num1 * num1;
                            System.out.println("Area: " + result);
                            break;

                        case 4:
                            System.out.println("Enter radius of the circle:");
                            num1 = input.nextDouble();
                            result = Math.PI * num1 * num1;
                            System.out.println("Area: " + result);
                            break;
                        default: 
                            System.out.println("Invalid option. Please try again.");
                            break;

            }
            break;

        }
    }
}