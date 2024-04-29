class Solution {
    public int minOperations(int[] nums, int k) {
        int final_xor = 0;
        int count = 0;
        
        for(int i = 0;i<nums.length;i++){
            final_xor = final_xor ^ nums[i];
        }
        
        while(k>0 || final_xor > 0){
            if((k%2) != (final_xor % 2)) count ++;
            k/=2;
        final_xor /= 2;
        }
        
        return count;
    }
    
    
}