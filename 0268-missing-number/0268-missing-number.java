class Solution {
    public int missingNumber(int[] nums) {
        int xor_one=0;
        int xor_two=0;
        int N = nums.length;
       
      
        for(int i = 0;i<N;i++){
          xor_two = xor_two ^ nums[i];
          xor_one = xor_one ^ (i+1); 
        }
   
      
      return xor_one ^ xor_two;
    }
}