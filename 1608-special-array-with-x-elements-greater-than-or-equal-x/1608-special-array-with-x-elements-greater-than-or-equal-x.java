class Solution {
  private int solve(int [] nums,int val){
      int start = 0;
      int end = nums.length-1;
      
      int idx = nums.length;
      while(start <= end){
        int mid = start + (end-start)/2;
        
        if(nums[mid] >= val){
          idx = mid;
          end = mid -1;
        }else{
          start = mid + 1;
        }
      }
      
      return idx;
  }
    public int specialArray(int[] nums) {
        //nums is special 
      Arrays.sort(nums);
      
      for(int i = 1;i<=nums.length;i++){
        //if x = 0 then 
        int k = solve(nums,i);
        if(nums.length-k == i){
          return i;
        }
      }
      
      return -1;
    }
}