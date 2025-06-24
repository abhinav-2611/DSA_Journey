package Numbers;

import java.util.Scanner;

public class CheckEveOdd {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");

        if (!sc.hasNextInt()) {
            System.out.println("Enter an integer value!");
            sc.close();
            return;
        }
        int num = sc.nextInt();

        if (num%2==0) { 
            System.out.println("["+num+"]" +" is an even number!");
        } else {
            System.out.println("["+num+"]" +" is an odd number!");
        }
        sc.close();
}
}