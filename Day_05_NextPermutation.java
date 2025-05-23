/**
 * # Next Permutation - Swap and Reverse Method
 *
 * This program implements the "Next Permutation" algorithm in Java using an efficient
 * approach that involves identifying the next lexicographical permutation of an array
 * of integers. If no such permutation exists (array is in descending order), the
 * array is rearranged into its smallest lexicographical order (sorted in ascending order).
 *
 * ## Approach:
 * 1. **Find the Pivot:** 
 *    Traverse from the end to find the first decreasing element (`nums[i]`).
 * 2. **Find the Successor:**
 *    Locate the smallest element greater than `nums[i]` from the right end (`nums[j]`).
 * 3. **Swap the Elements:**
 *    Swap `nums[i]` and `nums[j]` to form the next larger configuration.
 * 4. **Reverse the Subarray:**
 *    Reverse the subarray from `i+1` to the end to ensure the smallest possible
 *    lexicographical order.
 *
 * ## Time Complexity:
 * - **O(n):** Single traversal to find the pivot and successor, and a linear-time
 *   reversal of the subarray.
 *
 * ## Space Complexity:
 * - **O(1):** In-place manipulation of the array without extra space.
 *
 * ## Example:
 * - Input:  [1, 2, 3, 6, 5, 4]
 * - Output: [1, 2, 4, 3, 5, 6]
 *
 * This method ensures optimal performance and clarity in solving the Next Permutation problem.
 */


public class Day_05_NextPermutation {

    public static void nextPermutation(int[] arr) {
        int n = arr.length;
        int j = n-1;
        
        int pivot = -1;
        // To find pivot index 
        for(int i = n -2 ;i >= 0; i--){
            if (arr[i]< arr[i+1]){
                pivot = i;
                break;
            }
        }
        
        if(pivot == -1){
            reverse(arr,0,n-1);
            return;
        }
        
        for(int i = n-1; i>pivot; i--){
            if(arr[i] > arr[pivot]){
                swap(arr,i,pivot);
                break;
            }
        }
        
        reverse(arr,pivot+1,j);
     }
     
    private static void reverse(int arr[],int s, int e){
        while(s<e){
            swap(arr,s++,e--);
             
        }
     }
     
    private static void swap(int arr[],int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,6,5,4};
        nextPermutation(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

