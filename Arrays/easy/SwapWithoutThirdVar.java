package Arrays.easy;
import java.util.Scanner;
public class SwapWithoutThirdVar 
{
    public static void main(String[] args) 
    {
       Scanner scanner =new Scanner(System.in);
       System.out.print("enter val1 and val2 : ");
      int val1= scanner.nextInt();
       int val2=scanner.nextInt();

       val1 =val1+val2;
       val2= val1-val2;
       val1= val1-val2;

       System.out.print(" swapped values are val1="+val1+" and val2="+val2);
    scanner.close();
    }
  
}

