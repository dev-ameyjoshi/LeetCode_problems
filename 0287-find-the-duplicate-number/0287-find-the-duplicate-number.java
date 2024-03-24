class Solution {
    public int findDuplicate(int[] nums) {
        if(nums.length == 0) return 0;
        int start = 1;
        int end = nums.length-1;
        
        int dupli = -1;
        
        
        while(start<=end){
            int mid = start + (end-start)/2;
            int count = 0;
            for(int num : nums){
                if(num <= mid){
                    count++;
                }
            }
            
            if(count > mid){
                dupli = mid;
                end = mid-1;
            }else{
                start = mid + 1;
            }
        }
        
        return dupli;
    }
}