package Arrays.easy;

import java.util.Scanner;

public class FindUnique {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        
        System.out.print("Enter the size of the array: ");
        int size = obj.nextInt();

        
        int[] array = new int[size];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = obj.nextInt();
        }

        
        int returnedUniqueElement = uniqueNumber(array);
        if (returnedUniqueElement != -1) {
            System.out.println("Unique element is: " + returnedUniqueElement);
        } else {
            System.out.println("No unique element found.");
        }

        obj.close();
    }

    
    public static int uniqueNumber(int[] array) {
        int unique = 0;

       
        for (int num : array) {
            unique ^= num; // XOR cancels out duplicate elements
        }

        return unique != 0 ? unique : -1; // Return -1 if no unique number exists
    }
}
// return unique != 0 ? unique : -1; is a ternary operator in Java. It provides a concise way to write an if-else condition in a single line.

// general syntax : condition ? value_if_true : value_if_false;


//----------------------------------------------

/*
Explanation for enhanced loop used in the question

int num : array-> For each element in the array numbers, assign the value to num.
This loop automatically iterates through all elements in the array. */