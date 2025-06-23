package Arrays.intermediate;

// import java.util.Arrays;
import java.util.Scanner;

public class QuerySum {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size+1];
        System.out.print("Enter array elements: ");
        for (int i = 1; i <=size; i++) {
            array[i] = scanner.nextInt();
        }
       
       for (int i =1; i<array.length;i++) 
       {
          array[i]=array[i-1]+ array[i];
       }
      
       System.out.print("enter the index ranges to find the desiring Sum :");
       int l=scanner.nextInt();
       int r=scanner.nextInt();
       if(l < 1 || r < 1 || l > size || r > size || l > r)
       {
        System.out.println("give the valid ranges!");
       }
          
    
         int  prefixSum= array[r]-array[l-1];
     
      

    //   System.out.println(Arrays.toString(array));
      System.out.println("prefix sum from "+l+" to "+r+" is :"+prefixSum);
       
       scanner.close();
    }
}
