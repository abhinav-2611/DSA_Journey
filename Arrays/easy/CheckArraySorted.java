package Arrays.easy;

import java.util.Scanner;

public class CheckArraySorted {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input array elements
        int[] array = new int[size];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();    
        }
        
        System.out.println("The given array is sorted in ascending order:"+checkArraySorted(array));
         scanner.close();
    }
    static boolean checkArraySorted(int[]array)
    {
        
       for(int j=1;j<array.length;j++ )          // comparing the previous element to the next element
       {
         if(array[j-1]>array[j])
         {
            return false;
            
         }
       
       }
        return true;
   }
}
