    /**
     * Day 2: Push Zeros to End of Array
     *
     * Problem Statement:
     * Write a program to move all zeros in an array to the end while maintaining the order of non-zero elements.
     *
     * Approach:
     * - Use a pointer to track the position for the next non-zero element.
     * - Traverse the array and swap non-zero elements with zeros.
     *
     * Key Points:
     * - Input: An array of integers (e.g., [1, 2, 0, 4, 3, 0, 5, 0]).
     * - Output: The modified array with all zeros at the end (e.g., [1, 2, 4, 3, 5, 0, 0, 0]).
     * - Algorithm Complexity: O(n) for a single traversal of the array.
     */



import java.util.Arrays;


public class Day_02_pushZerosToEnd {


    static void pushZerosToEnd(int[] arr) {

        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {

            // If the current element is non-zero
            if (arr[i] != 0) {

                
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;

               
                count++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        pushZerosToEnd(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

