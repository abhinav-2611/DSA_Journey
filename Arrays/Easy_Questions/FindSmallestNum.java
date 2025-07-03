
public class FindSmallestNum {
    public static void main(String[] args) {
        
        int[] arr= {4,6,4,6,8,-2};
          
        int min = arr[0];
        for (int i = 1; i <arr.length; i++) {
             if (arr[i]<arr[0]) {
                min = arr[i];
             } 
        }
        System.out.println("Minimum number is :"+min);
        
    }
}
