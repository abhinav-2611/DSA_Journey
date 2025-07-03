import java.util.Arrays;

public class BubbleShort {
    
     public static void main(String[] args) {
         
        int arr[] = new int[]{7,8,3,1,2};

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j+1]<arr[j] ){
                     arr[j]= arr[j]+arr[j+1];;
                   arr[j+1]= arr[j]-arr[j+1];
                arr[j] = arr[j]- arr[j+1];
                }
            }
        }
        System.out.println("Sorted Array: "+Arrays.toString(arr));
}
}
