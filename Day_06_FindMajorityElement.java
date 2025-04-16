
/**
 * Problem: Find Majority Elements Appearing More Than n/3 Times
 *
 * Description:
 * Given an integer array, the task is to find all elements that appear more than ⌊n/3⌋ times. 
 * At most, there can be two such majority elements in an array. This is an extension of 
 * the classic majority element problem and requires a more efficient approach than brute force.
 *
 * Approach:
 * - Use the Boyer-Moore Voting Algorithm to find up to two potential candidates:
 *   1. Traverse the array while maintaining two candidate variables and their counts.
 *   2. Adjust candidates based on the current element and their counts.
 * - Validate the candidates:
 *   1. Recount their occurrences in the array.
 *   2. Verify if their counts exceed ⌊n/3⌋.
 * - Return the validated majority elements.
 *
 * Example:
 * Input: nums = [1, 2, 3, 1, 1, 2, 2, 2]
 * Output: [1, 2]
 *
 * Key Takeaways:
 * - The Boyer-Moore Voting Algorithm is efficient, with a time complexity of O(n) 
 *   and a space complexity of O(1).
 * - The problem demonstrates the use of candidate elimination in large data sets.
 */


import java.util.List;
import java.util.ArrayList;


public class Day_06_FindMajorityElement {
    public static List<Integer> findMajority(int[] nums) {
        
        int n = nums.length;
        int num1 = -1, num2 = -2;
        int c1 = 0, c2 = 0;
        
        for(int num:nums){
            if(num1 == num){
                c1++;
            }
            else if(num2 == num){
                c2++;
            }
            else if(c1 == 0){
                num1 = num;
                c1++;
                
            }
            else if(c2 == 0){
                num2 = num;
                c2++;
            }
            else{
                c1--;
                c2--;
            }
        }

        List<Integer> res = new ArrayList<>();
        c1 = 0;
        c2 = 0;
        
        for(int num : nums){
            if(num1 == num){
                c1++;
            }
            if(num2 == num){
                c2++;
            }
        }
        
        if(c1 > n/3){
            res.add(num1);
        }
        
        if(c2 > n/3 && num1 != num2){
            res.add(num2);
        }
        
        if(res.size() == 2 && res.get(0) > res.get(1)){
            int temp = res.get(0);
            res.set(0,res.get(1));
            res.set(1,temp);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        List<Integer> result = findMajority(nums);
        System.out.println(result); // Output: [3]
    }
}
