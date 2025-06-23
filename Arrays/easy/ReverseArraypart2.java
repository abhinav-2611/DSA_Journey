//reversing an array wihtout using empty Array

package Arrays.easy;
import java.util.Scanner;
import java.util.Arrays;
public class ReverseArraypart2 {
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
        reverseAnArray(array);
        System.out.println(Arrays.toString(array));
        scanner.close();
    }

    static  void reverseAnArray(int[]array)
    {
        int i=0;
        int j=array.length-1;
        while (i<j)       
        {
          array[i]= array[i] +array[j];
          array[j]= array[i]-array[j];
          array[i]= array[i]-array[j];
            i++;
            j--;

        } 
    }
}
