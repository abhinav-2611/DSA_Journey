package Arrays.easy;

import java.util.*;
public class ReturnArrayBigSmallVal {
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
        
     int returedArray[]= BigAndSmallValArray(array);
     System.out.println("smallest and biggest value in the given array are: "+Arrays.toString(returedArray));
     scanner.close();
    }
    static int[] BigAndSmallValArray(int []array)
    {
        int min_val= array[0];
        int max_val=array[0];
        for(int i=0;i<array.length;i++)
        {
            if(array[i]<min_val)
            {
              min_val =array[i] ;
            }
            if(array[i]>max_val)
            {
                max_val=array[i];
            }
        }
        
        
        return  new int[] { min_val,max_val};     // way to return array with explicit declaration
    }
}
