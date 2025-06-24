package Numbers;

import java.util.Scanner;

public class StrongNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");

        if (!sc.hasNextLong()) {
            System.out.println("Enter a valid integer value!");
            sc.close();
            return;
        }

        long num = sc.nextLong();

        // Show 0! = 1 if user enters 0
        if (num == 0) {
            System.out.println("0! = 1");
        }

        long copyNum = num;
        long factTotal = 0;

        while (copyNum != 0) {
            long digit = copyNum % 10;
            long digitFact = calFac(digit);

            // Show each digit factorial, including 0
            System.out.println(digit + "! = " + digitFact);

            factTotal += digitFact;
            copyNum /= 10;
        }

        if (num == factTotal) {
            System.out.println(num + " is a Strong Number!");
        } else {
            System.out.println(num + " is not a Strong Number.");
        }

        sc.close();
    }

    static long calFac(long digit) {
        long fact = 1;

        for (long i = digit; i >= 1; i--) {
            fact *= i;
        }

        return fact;
    }
}

// Strong number also called Krishnamurthy Number.