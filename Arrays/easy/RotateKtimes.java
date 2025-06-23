package Arrays.easy;

import java.util.*;

public class RotateKtimes 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
         if(size<2)
         {
            System.out.println("enter the size of an array above 2");
            scanner.close();
            return;
         }
       
           int[] array = new int[size];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < size; i++)
        {
            array[i] = scanner.nextInt();    
        }
        System.out.print("number of times u want to rotate the array :");
        int k=scanner.nextInt();

            k = k%size;

          int answer_array[]= new int[size];
         
        K_rotation(array,answer_array,k,size);
        System.out.println("Original Array :"+Arrays.toString(array));
        System.out.println("Rotated Array: "+Arrays.toString(answer_array));
        scanner.close();
    }
     static void K_rotation(int[]array,int[]answer_array,int k,int size)
   {
       int l=0;
        for(int i=size-k;i<size;i++)
        {
            answer_array[l++]= array[i]; 
            
        }
        for(int j=0;j<size-k;j++)
        {
            answer_array[l++]=array[j];
            
        }
   }
}
