package Arrays.intermediate;
import java.util.Scanner;

public class PrefixSum_SuffixSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < size; i++) {  
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the index from where you want to compare prefix and suffix sum: ");
        int index = scanner.nextInt();

        if (index < 0 || index >= size) {
            System.out.println("Invalid index. Index must be between 0 and " + (size - 1));
        } else {
            boolean isTrue = Sum(index, array);
            System.out.println("Suffix and prefix sum are equal? Answer => " + isTrue);
        }

        scanner.close();
    }

    static boolean Sum(int index, int[] array) {
        int prefixSum = 0;
        int suffixSum = 0;

       for(int i=1;i<array.length;i++)
       {
         array[i]=array[i-1]+array[i];
       }
       prefixSum= array[index];
       suffixSum= array[array.length-1]-array[index];

        System.out.println("Prefix sum: " + prefixSum);
        System.out.println("Suffix sum: " + suffixSum);

        return prefixSum == suffixSum;
    }
}
