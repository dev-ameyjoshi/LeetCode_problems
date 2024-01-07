class Solution {
    public int lengthOfLIS(int[] nums) {
        int t[] = new int [nums.length];
        
        for(int i = 0;i<nums.length;i++){
            t[i] = 1;
        }
        
        for(int i = 1;i< nums.length;i++){
            for(int j = 0;j<i;j++){
                if(nums[i] > nums[j]){
                    t[i] = Math.max(t[i],t[j]+1);
                }
            }
        }
        
        int lambu = 0;
        
        for(int c : t){
            lambu = Math.max(lambu,c);
        }
        
        return lambu;
        
    }
}