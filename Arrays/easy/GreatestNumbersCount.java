package Arrays.easy;

import java.util.Scanner;

public class GreatestNumbersCount {
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

        // Input the limited value
        System.out.print("Enter the limited value: ");
        int limitedVal = scanner.nextInt();

        // Check if the limited value exists in the array
        boolean isPresent = false;
        for (int value : array) {
            if (value == limitedVal) {
                isPresent = true;
                break;
            }
        }

        if (isPresent) {
            // Calculate and print the count of numbers greater than the limited value
            int count = calculateGreatestNumberCount(limitedVal, array);
            System.out.println("Count of numbers greater than " + limitedVal + ": " + count);
        } else {
            System.out.println("The entered value " + limitedVal + " is not present in the array!");
        }

        scanner.close();
    }

    static int calculateGreatestNumberCount(int limitedVal, int[] array) {
        int count = 0;
        for (int value : array) {
            if (value > limitedVal) {
                count++;
            }
        }
        return count;
    }
}
