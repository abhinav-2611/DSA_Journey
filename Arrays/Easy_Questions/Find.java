
import java.util.Scanner;

public class Find {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        if (!sc.hasNextInt()) {
            System.out.println("Enter valid Integer!");
            sc.close();
            return;
        }

        int size = sc.nextInt();
        if (size < 2) {
            System.out.println("Enter the size greater than 1!");
            sc.close();
            return;
        }

        int[] arr = new int[size];
        System.out.print("Enter the array values: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int secondSmallest = FindSecondSmallestNum(arr);
        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("Second smallest number not found (all elements may be same).");
        } else {
            System.out.println("Second smallest number: " + secondSmallest);
        }

        sc.close();
    }

    static int findSmallest(int[] arr) {
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    static int FindSecondSmallestNum(int[] arr) {
        int min = findSmallest(arr);

        // Replace all occurrences of min with Integer.MAX_VALUE
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                arr[i] = Integer.MAX_VALUE;
            }
        }

        // Now find second smallest, ignore if all elements were the same
        int secondSmallest = findSmallest(arr);

        // If no second smallest found, return max value
        return secondSmallest;
    }
}
