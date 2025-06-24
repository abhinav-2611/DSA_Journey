package Numbers;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");

        if (!sc.hasNextInt()) {
            System.out.println("Enter a valid integer value!");
            sc.close();
            return;
        }

        int num = sc.nextInt();

        long first = 0, second = 1;

        System.out.println("Fibonacci Series up to " + num + " terms:");

        for (int i = 1; i <= num; i++) {
            System.out.print(first + " ");
            long next = first + second;
            first = second;
            second = next;
        }

        sc.close();
    }
}
