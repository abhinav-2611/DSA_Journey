import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {

         int[] arr = {-2,3,0,3,-3};// way to initialize and declare array at same time

       for (int i = 0; i < arr.length; i++) {
        for (int j = arr.length-1; j>i; j--) {
             if (arr[j]<arr[i]) {
            arr[i]= arr[i]+arr[j];;
             arr[j]= arr[i]-arr[j];
             arr[i] = arr[i]- arr[j];
        }
        }
       }
        System.out.println("Sorted arrays: "+ Arrays.toString(arr));
    }
}
