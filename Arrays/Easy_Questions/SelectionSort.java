import java.util.Arrays;

public class SelectionSort {
     public static void main(String[] args) {
         
        int arr[] = new int[]{7,8,3,1,2};

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[i] ){
                     arr[i]= arr[i]+arr[j];;
                   arr[j]= arr[i]-arr[j];
                arr[i] = arr[i]- arr[j];
                }
            }
        }
        System.out.println("Sorted Array: "+Arrays.toString(arr));
    }
}
