package Numbers;
import java.util.Scanner;
public class AllDivisors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");

        if (!sc.hasNextLong()) {
            System.out.println("Enter a valid numeric value!");
            sc.close();
            return;  // Exit if input is invalid
        }

        long num = sc.nextLong();
        if (num <= 0) {
            System.out.println("Enter a positive number greater than 0!");
        } else {
            System.out.println("Divisors of " + num + ":");
            for (long i = 1; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    System.out.println(i);
                    if (i != num / i) {
                        System.out.println(num / i); // Print the corresponding divisor
                    }
                }
            }
        }
        sc.close();
    }
}
