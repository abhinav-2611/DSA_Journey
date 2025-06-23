package Arrays.intermediate;
import java.util.Arrays;
import java.util.Scanner;



public class PrefixSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        if (size < 2) {
            System.out.println("Enter the size of an array above 2");
            scanner.close();
            return;
        }

        int[] array = new int[size];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Original Array :"+Arrays.toString(array));
        CalculateSum(array);
        System.out.println("Prefix Sum Array :"+Arrays.toString(array));
        scanner.close();
    }
       static void CalculateSum(int[] array)
    {
        int prefixSum=0;
       for (int i =0; i< array.length;i++) 
       {
          prefixSum= prefixSum+array[i];
          array[i]=prefixSum;
       }
    
    }
}
