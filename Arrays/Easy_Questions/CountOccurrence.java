public class CountOccurrence{
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 7, 9, 7};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == Integer.MIN_VALUE) {
                continue;  // Skip if already counted
            }

            int count = 1;  // Start with 1 for the current element

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = Integer.MIN_VALUE;  // Mark duplicate as countedSorting {

                }
            }

            System.out.println(arr[i] + " appears " + count + " time(s)");
        }
    }
}
