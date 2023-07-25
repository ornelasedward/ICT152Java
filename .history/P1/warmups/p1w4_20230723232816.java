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
