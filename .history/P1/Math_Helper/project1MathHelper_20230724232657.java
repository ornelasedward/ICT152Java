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
                    for (int i = start; i <= end; i++) {
                        if (i % 2 == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    break;

                    case "F": // Other Calculations
                    System.out.println("Select the type of calculation:");
                    System.out.println("1. Body Mass Index (BMI) Calculation");
                    System.out.println("2. Loan Monthly Payment Calculation");
                    System.out.println("3. Compound Interest Calculation");
                    System.out.println("4. Temperature Conversion");

                    int calcOption = input.nextInt();

                    switch (calcOption) {
                        case 1: // BMI Calculation
                            System.out.println("Enter your weight in kilograms: ");
                            double weight = input.nextDouble();

                            System.out.println("Enter your height in meters: ");
                            double height = input.nextDouble();

                            double bmi = weight / Math.pow(height, 2);
                            System.out.printf("Your Body Mass Index (BMI) is %.2f\n", bmi);
                            break;

                        case 2: // Loan Monthly Payment Calculation
                            System.out.println("Enter the loan amount: ");
                            double loanAmount = input.nextDouble();

                            System.out.println("Enter the interest rate per year: ");
                            double yearlyInterestRate = input.nextDouble();

                            System.out.println("Enter the loan term in years: ");
                            int loanTermInYears = input.nextInt();

                            double monthlyInterestRate = yearlyInterestRate / (12 * 100);
                            double numberOfMonthlyPayments = loanTermInYears * 12;

                            double monthlyPayment = (loanAmount * monthlyInterestRate) /
                                                    (1 - Math.pow(1 + monthlyInterestRate, -numberOfMonthlyPayments));

                            System.out.printf("Your monthly loan payment is %.2f\n", monthlyPayment);
                            break;

                        case 3: // Compound Interest Calculation
                            System.out.println("Enter the principal amount: ");
                            double principalAmount = input.nextDouble();

                            System.out.println("Enter the interest rate per year: ");
                            double interestRatePerYear = input.nextDouble();

                            System.out.println("Enter the number of years: ");
                            int numberOfYears = input.nextInt();

                            double compoundInterest = principalAmount * 
                                                      Math.pow(1 + (interestRatePerYear / 100), numberOfYears) -
                                                      principalAmount;

                            System.out.printf("The compound interest is %.2f\n", compoundInterest);
                            break;

                        case 4: // Temperature Conversion
                            System.out.println("Enter the temperature in Celsius: ");
                            double celsius = input.nextDouble();

                            double fahrenheit = (celsius * 9 / 5) + 32;
                            System.out.printf("The temperature in Fahrenheit is %.2f\n", fahrenheit);
                            break;

                        default:
                            System.out.println("Invalid input! Please try again.");
                    }
                    break;

            case "G":
                System.out.println("Existing the program...");
                break;

            default:
                System.out.println("Invalid option. Please try again.");
                break;
        }
    } while (!choice.equals("G"));
    input.close();
    }
}