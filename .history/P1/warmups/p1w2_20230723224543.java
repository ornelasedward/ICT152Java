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
