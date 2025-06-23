package Arrays.easy;
import java.util.*;

public class FindTriplets {
    public static void main(String[] args)
     {
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
        
        System.out.println("enter the target value :");
        int target =obj.nextInt();
        System.out.println("number of tripets sum present in an arrays :"+returned_triplets(array,target));
        obj.close();
    }

    static int returned_triplets(int []array,int target)
    {
        int ans=0;
        for(int i=0;i<array.length-2;i++)
        {
            for(int j=i+1;j<array.length-1;j++)
            {
                for(int k=j+1;k<array.length;k++)
                {
                    if(array[i]+array[j]+array[k]==target)
                    {
                        ans++;
                        
                    }
                }
            }
        }
        return ans;
    }
}
