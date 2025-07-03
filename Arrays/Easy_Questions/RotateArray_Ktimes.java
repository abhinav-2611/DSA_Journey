import java.util.Scanner;
import java.util.Arrays;

public class RotateArray_Ktimes {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 1, 5, 9};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of times you want to rotate: ");
        int k = sc.nextInt();

        System.out.println("Original array: " + Arrays.toString(arr));
        int n = arr.length;

        k = k % n;  // Normalize k if it's greater than n

        int[] rotated = new int[n];
        int j = 0;

        // Copy last k elements to beginning
        for (int i = n - k; i < n; i++) {
            rotated[j++] = arr[i];
        }

        // Copy first n-k elements
        for (int i = 0; i < n - k; i++) {
            rotated[j++] = arr[i];
        }

        System.out.println("Rotated array: " + Arrays.toString(rotated));
        sc.close();
    }
}
