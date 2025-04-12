public class Day_03_ReverseTheArray {
    
    /**
     * Day 3: Reverse the Array
     *
     * Problem Statement:
     * Write a program to reverse an array in place.
     *
     * Approach:
     * - Use two pointers, one at the start and one at the end of the array.
     * - Swap elements until the pointers meet in the middle.
     *
     * Key Points:
     * - Input: An array of integers (e.g., [1, 2, 3, 4, 5]).
     * - Output: The reversed array (e.g., [5, 4, 3, 2, 1]).
     * - Algorithm Complexity: O(n) for a single traversal of the array.
     */
    public static void reverseArray(int[] arr) {
 
        int n = arr.length;
        int temp[] = new int[n];
        int j = n - 1;
        for(int i = 0; i < n; i++) {
            temp[i] = arr[j - i];
        }

        for(int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverseArray(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
