package com.company;
//O(n) solution for sliding window technique.
public class slidingWindowTechnique {
  static int maxSum(int arr[],int n, int k){
      if (n<k) {
          System.out.println("Invalid");
          return -1;
      }

      //To compute the first window hence the size k.
      int max_sum=0;
      for (int i = 0;i<k;i++) {
          max_sum+=arr[i];
      }

      /*To pop the element at the last index and push the element at the new index.
        or Compute sums of remaining windows by
        removing first element of previous
        window and adding last element of
        current window.
*/
      int window_sum = max_sum;
      for (int i =k;i<n;i++){
          window_sum += arr[i] -arr[i-k];
          max_sum = Math.max(max_sum,window_sum);
      }
      return max_sum;
  }

    public static void main(String[] args) {
         int arr[] = {1, 4, 2, 10, 2, 3, 1, 0, 20 };
         int n = arr.length;
         int k = 4;

        System.out.println(maxSum(arr,n,k));
        //Function called till length of array
    }
}
