class Solution {
//   private int solve(int [] nums,int val){
//       int start = 0;
//       int end = nums.length-1;
      
//       int idx = nums.length;
//       while(start <= end){
//         int mid = start + (end-start)/2;
        
//         if(nums[mid] >= val){
//           idx = mid;
//           end = mid -1;
//         }else{
//           start = mid + 1;
//         }
//       }
      // binary search method
//       return idx;
//   }
    public int specialArray(int[] nums) {
        //nums is special 
      // Arrays.sort(nums);
      int n = nums.length;
      int [] freq = new int[n + 1];
      
      for(int i = 0;i<n;i++){
        //if x = 0 then 
        freq[Math.min(n,nums[i])]++;
      }
      
      int num = 0;
      
      for(int i = n;i>=1;i--){
        num += freq[i];
        if(num == i){
          return i;
        }
      }
      return -1;
    }
}