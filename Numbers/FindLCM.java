package Numbers;

import java.util.Scanner;

public class FindLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        if (!sc.hasNextInt()) {
            System.out.println("Enter valid value!");
            sc.close();
            return;
        }
        int num1 = sc.nextInt();

        System.out.print("Enter your second number: ");
        if (!sc.hasNextInt()) {
            System.out.println("Enter valid value!");
            sc.close();
            return;
        }
        int num2 = sc.nextInt();

        int HCF = findGCD(num1, num2);
        int LCM = (num1 * num2) / HCF;

        System.out.println("LCM of the two numbers is: " + LCM);
        sc.close();
    }

    static int findGCD(int num1, int num2) {
        for (int i = Math.min(num1, num2); i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                return i;
            }
        }
        return 1;
    }
}

/*
  formula to find LCM =  (a * b) / HCF(a, b);

 */