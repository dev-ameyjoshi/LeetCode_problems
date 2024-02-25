class Solution {
    static int solveFirst(int []nums,int h,int l,int target){
        int res = -1;
        while(h<=l){
            int m = h+ (l-h)/2;
            
            if(target == nums[m])
            {
                res = m;
                l = m-1;
            }
            else if(target<nums[m]){
                l = m-1;
            }else{
                h = m+1;
            }
           
        }
         return res;
    }
    static int solveSecond(int []nums,int h,int l,int target){
        int res = -1;
        while(h<=l){
            int m = h+ (l-h)/2;
            
            if(target == nums[m])
            {
                res = m;
                h = m+1;
            }
            else if(target<nums[m]){
                l = m-1;
            }else{
                h = m+1;
            }
           
        }
         return res;
    }
    public int[] searchRange(int[] nums, int target) {
        int res1 = solveFirst(nums,0,nums.length-1,target);
        int res2 = solveSecond(nums,0,nums.length-1,target);
        return new int[]{res1,res2};
    }
}