package Arrays.easy;
import java.util.*;

public class FrequencyArray {
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

        
        int[] Frequency_Array = new int[1000005];

        CountFrequency(array, Frequency_Array);
        scanner.close();
    }

    static void CountFrequency(int[] array, int[] Frequency_Array) {
        Scanner sc = new Scanner(System.in);

        // Build frequency array
        for (int i = 0; i < array.length; i++) {
            Frequency_Array[array[i]]++;
        }

        System.out.print("Enter the number of queries: ");
        int q = sc.nextInt();

        
        while (q > 0) {
            System.out.print("Enter the query: ");
            int queries = sc.nextInt();
            if (queries >= 0 && queries < Frequency_Array.length && Frequency_Array[queries] > 0) { 
                System.out.println("YES "+queries+" is present");
            } else {
                System.out.println("NO "+queries+" is not present");

            }
            q--;
        }
        sc.close();
    }
}
