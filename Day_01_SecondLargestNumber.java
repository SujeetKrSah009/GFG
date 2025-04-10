// Java program to find the second largest element in the array
// using one traversal


import java.util.Arrays;

class Day_01_SecondLargestNumber {

    public static int getSecondLargest(int[] arr) {
    
        int n = arr.length;
        int max = -1;
        int secMax = -1;
        
        
        for(int i=0; i< n;i++){
            if(arr[i]>max){
                secMax = max;
                max = arr[i];
            }
            else if(arr[i]< max && arr[i] > secMax){
                secMax = arr[i];
            }
        }
        
        return secMax;
    }


    public static void main(String[] args) {
       int num[] = {12, 35, 1, 10, 34, 1};
       int num1[] = {10, 5, 10};
       int num2[] = {10, 5, 10, 5}; 
       int num3[] = {10, 5, 10, 5, 20};
       System.out.println(getSecondLargest(num)); 
      System.out.println(getSecondLargest(num1));
      System.out.println(getSecondLargest(num2));
       System.out.println(getSecondLargest(num3));
    }
}



