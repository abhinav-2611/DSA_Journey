package Numbers;
import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");

        try {
            int n = sc.nextInt();

            if (n < 0) {
                System.out.println("Enter a valid positive number!");
            } else {
                int copyNum = n;
                int sum = 0;
                int digits = String.valueOf(copyNum).length();

                while (n != 0) {
                    int digit = n % 10;
                    sum += Math.pow(digit, digits);
                    n = n / 10;
                }

                if (copyNum == sum) {
                    System.out.println("Given number is Armstrong");
                } else {
                    System.out.println("Given number is not Armstrong");
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a numeric value.");
        }

        sc.close();
    }
}
