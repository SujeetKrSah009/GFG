  /**
 * Problem: Rotate a 1D array in a counterclockwise direction.
 *
 * Description:
 * Given an array, the goal is to rotate it to the left by a given number of positions (d). 
 * This involves shifting the elements in the array such that the first k elements 
 * are moved to the end while maintaining the order of the rest.
 *
 * Approach:
 * - Use modular arithmetic to handle cases where d > array length.
 * - Create a temporary array to store the rotated elements.
 * - Copy the rotated result back into the original array to reflect the changes in place.
 *
 * Example:
 * Input: arr = [1, 2, 3, 4, 5], d = 2
 * Output: arr = [3, 4, 5, 1, 2]
 *
 * Key Takeaways:
 * - Modular arithmetic simplifies rotation for large values of d.
 * - Rotations are commonly used in data manipulation tasks.
 */


public class Day_04_Rotating_Array {

    public static void rotateArr(int arr[], int d) {
      
        int n = arr.length;
        
        int j = n-1;
        
        d = d%n;
        
        reverse(arr,0,d-1);
        reverse(arr,d,j);
        reverse(arr,0,j);
        
      }
      
      public static void reverse(int arr[],int start, int end){
          while(start<end){
              int temp = arr[start];
              arr[start] = arr[end];
              arr[end] = temp;
              start++;
              end--;
          }
      }

      public static void main(String[] args) {
            int arr[] = {1, 2, 3, 4, 5};
            int d = 2;
            rotateArr(arr, d);
            for (int num : arr) {
                System.out.print(num + " ");
            }
      }
}
