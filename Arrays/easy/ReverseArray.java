// Reversing an ARRAY using an empty Array

package Arrays.easy;
import java.util.Scanner;
import java.util.Arrays;
public class ReverseArray {
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
       int reversed_Array[]=new int[size];
        reversedArray(array,reversed_Array);
        System.out.println(Arrays.toString(reversed_Array));
        scanner.close();
    }
    static void reversedArray(int[]array,int[]reversed_Array)
    {
         int j=0;
        for(int i=array.length-1;i>=0;i--)  
        {
            reversed_Array[j]=array[i];
              j++;
        }  
    }
}
