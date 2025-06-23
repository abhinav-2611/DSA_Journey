package Arrays.easy;
import java.util.*;
public class ReturnFirstRepeatedVal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
         if(size<2)
         {
            System.out.println("enter the size of an array above 2");
            scanner.close();
            return;
         }
       
        int[] array = new int[size];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();    
        }
       System.out.println("first repeated value is: " + FirstRepeatedVal(array));
        scanner.close();
    }

   static  int FirstRepeatedVal(int[]array)
    {
        
        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                if(array[i]==array[j])
                {
                   return array[i];
                }
            }
        }
       return -1;
    }
}
