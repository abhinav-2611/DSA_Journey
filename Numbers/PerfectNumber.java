package Numbers;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");

        if (!sc.hasNextLong()) {
            System.out.println("Enter a valid numeric value!");
            sc.close();
            return;
        }

        long num = sc.nextLong();

        if (num <= 0) {
            System.out.println("Please enter a number greater than zero.");
            sc.close();
            return;
        }

        long sumDiv = 1; // 1 is always a proper divisor
        for (long i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sumDiv += i;
                long pairedDiv = num / i;
                if (pairedDiv != i) { // Avoid adding square root twice
                    sumDiv += pairedDiv;
                }
            }
        }

        if (num == 1) {
            System.out.println("1 is not a perfect number.");
        } else if (sumDiv == num) {
            System.out.println(num + " is a perfect number!");
        } else {
            System.out.println(num + " is not a perfect number.");
        }

        sc.close();
    }
}
