public class CalSumArray {
    public static void main(String[] args) {
        
       int[] arr = new int[]{1, 1, -1, -1, -1};

       int sum =0;
       for (int i = 0; i < arr.length; i++) {
          sum = sum+arr[i];
       }

       System.out.println("Sum: " + sum);
    }
}
