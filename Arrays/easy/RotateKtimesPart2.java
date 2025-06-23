package Arrays.easy;

import java.util.*;

public class RotateKtimesPart2 {
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
        System.out.print("Number of times you want to rotate the array: ");
        int k = scanner.nextInt();

        
        K_rotation(array, k, size);

        System.out.println("Resultant rotated array: " + Arrays.toString(array));
        scanner.close();
    }

    static void K_rotation(int[] array, int k, int size) {
        
        k = k % size;

        // Reverse the first part (0 to size-k-1)
        reverse(array, 0, size - k - 1);

        // Reverse the second part (size-k to size-1)
        reverse(array, size - k, size - 1);

        // Reverse the entire array
        reverse(array, 0, size - 1);
    }

    
    static void reverse(int[] array, int start, int end) {
        while (start < end) {
            // Swap elements at start and end
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }
}
