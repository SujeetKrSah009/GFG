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
