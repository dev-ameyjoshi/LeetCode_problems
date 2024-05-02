class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = -1;
        
        int start = 0;
        int end = n-1;
        
        while(start < end){
            if(-nums[start] == nums[end]){
               return nums[end];
            }
            else if(-nums[start] > nums[end]){
                ++start;
                
            }else{
                --end;
            }
        }
        return ans;
    }
}