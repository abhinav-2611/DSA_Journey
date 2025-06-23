package Numbers;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

         System.out.println("Enter the number!");
        // Check if input is not a number or whether the input value exceeds the range of the written datatype
        if(!sc.hasNextLong())
        {
            System.out.println("Enter valid number");
            sc.close();
            return;
        }

        long n = sc.nextLong();
        System.out.println("original number"+ n);
     
        long rev =0;
        long number = Math.abs(n);
        while (number!=0) {
            long digit = number%10;
            rev = rev*10+digit;
            number=number/10;
        }

      if(n<0)
      {
        rev = -rev;
      }
      System.out.println("Reversed Number: "+rev);
      sc.close();
    }

}
