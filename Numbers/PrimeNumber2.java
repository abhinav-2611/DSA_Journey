package Numbers;

import java.util.Scanner;

public class PrimeNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range (start and end): ");

        if (!sc.hasNextInt()) {
            System.out.println("Enter a valid start value!");
            sc.close();
            return;
        }
        int num1 = sc.nextInt();

        if (!sc.hasNextInt()) {
            System.out.println("Enter a valid end value!");
            sc.close();
            return;
        }
        int num2 = sc.nextInt();

        System.out.println("Prime numbers between " + num1 + " and " + num2 + ":");

        for (int j = num1; j <= num2; j++) {
            if (isPrime(j)) {
                System.out.println(j);
            }
        }

        sc.close();
    }

    // Helper function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
