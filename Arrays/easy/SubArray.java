package Arrays.easy;

public class SubArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        for (int i = 0; i < array.length; i++) { // Starting index of the subarray
            for (int j = i; j < array.length; j++) { // Ending index of the subarray
                for (int k = i; k <= j; k++) { // Print elements from i to j
                    System.out.print(array[k] + " ");
                }
                System.out.println(); // New line for the next subarray 
            }
        }
    }
}
