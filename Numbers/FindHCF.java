package Numbers;
import java.util.Scanner;

public class FindHCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers :");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if (n1 <= 0 || n2 <= 0) {
            System.out.println("Enter valid positive numbers only");
        } else {
            int highcommonfac = 1;
            int min = Math.min(n1, n2);

            for (int i = min; i >= 1; i--) {
                if (n1 % i == 0 && n2 % i == 0) {
                    highcommonfac = i;
                    break;
                }
            }

            System.out.println("HCF of two numbers is: " + highcommonfac);
        }

        sc.close();
    }
}


//approach 

/* -to find HCF of two numbers : 1) find all the factors of 1st numbers 2) find all the factors of 2nd number .3) Find the greatest common factor among them
   
- No number greater than the smaller of the two can divide both. (eg: 26,32 = factors till 26 of both)
 */

 //edge cases
 /*
  1) ⚠️ 1. One or both numbers are zero
           HCF(n, 0) = |n|
           HCF(0, 0) is undefined (you should handle this explicitly)

  2)⚠️ 2. Negative numbers
          HCF is always positive, even if inputs are negative.
          Take absolute values before processing.
  */