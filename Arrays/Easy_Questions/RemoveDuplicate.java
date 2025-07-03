import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        
        int[] arr = new int[]{2, 3, 4, 3, 5};
        int[] newArr = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            for (int k = 0; k < j; k++) {
                if (arr[i] == newArr[k]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                newArr[j++] = arr[i];
            }
        }

        // Create final array with only unique elements
        int[] finalArr = Arrays.copyOf(newArr, j);
        System.out.println("New array without duplicates: " + Arrays.toString(finalArr));
    }
}
