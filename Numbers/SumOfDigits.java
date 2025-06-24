package Numbers;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");

        if (!sc.hasNextInt()) {
            System.out.println("Enter an integer value!");
            sc.close();
            return;
        }

        int num = sc.nextInt();
        int originalNum = num; // Store original number for display
        int sum = 0;

        if (num == 0) {
            System.out.println("Sum of digits of 0 is: 0");
        } else {
            num = Math.abs(num); // Handle negative numbers if any

            while (num != 0) {
                sum += num % 10;
                num = num / 10;
            }

            System.out.println("Sum of digits of " + originalNum + " is: " + sum);
        }

        sc.close();
    }
}
