package Arrays.easy;

import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
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
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();    
        }
        int obtainSecondLargestval= findSecondLargeElement(array);
        if(obtainSecondLargestval==Integer.MIN_VALUE)
        {
            System.out.println("elements in the arraya are identical");
        }
        else{
            System.out.println("second largest element in the array is :"+obtainSecondLargestval);
        }
        System.out.println("second largest element in the array is :"+findSecondLargeElement(array));;
        scanner.close();
    }
    static int  findLargeElement(int[]array)
   {
       int max=array[0];
       for(int i=1;i< array.length;i++)
       {
          if(max<array[i])   // array[0]<array[i] (WRONG) //   use max instead of array[0] for commparing as max is independent value .
                                //(to know clearly paste the code to chatgpt and ask for it)
          {
            max=array[i];        
          }
       }  
       return max;  
   }

   static int findSecondLargeElement(int []array)
   {

    int returned_max_val= findLargeElement(array);
    for(int i=0;i< array.length;i++)
    {
        if(array[i]==returned_max_val)
        {
            array[i]=Integer.MIN_VALUE;
        }
    }
    int second_max_val =findLargeElement(array);
    return second_max_val;
   }

}

// edge cases for this question

/*Edge Cases:
 Single Element Array:
Input: [5]


All Elements Identical:
Input: [3, 3, 3, 3]
*/