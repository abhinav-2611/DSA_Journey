package Arrays.easy;

import java.util.Scanner;

public class CountOccurrence {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        // Input size of the array
        System.out.print("Enter the size of the array: ");
        int size = obj.nextInt();
        obj.nextLine(); // Consume the newline character

        // Input array elements as a single line
        int []array=new int[size];
        System.out.print("Enter array elements : ");
        for(int i=0;i<size;i++)
        {
           array[i]=obj.nextInt();
        }
        
        // Input the value to search
        System.out.print("Enter the value to be searched: ");
        int search_value = obj.nextInt();

        // Calculate and print the count
        System.out.println("Number of times " + search_value + " appears in the array: " 
                           + calculate_count(search_value, array) + "times");
                           
                obj.close();
    }

    public static int calculate_count(int search_value, int[] array) {
        int count = 0;
        for (int num : array) {
            if (num == search_value) {
                count++;
            }
        }
        return count;
    }
}
