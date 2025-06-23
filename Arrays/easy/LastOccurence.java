package Arrays.easy;

import java.util.Scanner;

public class LastOccurence {
    public static void main(String[] args) {
        Scanner objct= new Scanner(System.in);
        // Input size of the array
        System.out.print("Enter the size of the array: ");
        int size = objct.nextInt();
        objct.nextLine(); // Consume the newline character

        // Input array elements as a single line
        int []array=new int[size];
        System.out.print("Enter array elements : ");
        for(int i=0;i<size;i++)
        {
           array[i]=objct.nextInt();
        }
        
      
        System.out.print("Enter the value to be searched for it's last occurence: ");
        int search_value = objct.nextInt();

        
        System.out.println("last occurence of " + search_value + " in the array is at index: [" 
                           + calculate_last_occurence(search_value, array) + "]" );

        objct.close();
    }
      static int calculate_last_occurence(int search_value,int []array)
      {
        int last_index=-1;
         for(int i=0;i<array.length;i++)
         {
            if(array[i]==search_value){
             
                last_index =i;
            }
          
         }
        
         return last_index;
       
      }
      
    }

