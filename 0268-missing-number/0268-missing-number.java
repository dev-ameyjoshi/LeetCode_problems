class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
      
        Set<Integer> numSet = new HashSet<Integer>();
        for(int num:nums) numSet.add(num);
        
        int expectedNumCount = nums.length+1;
        
        for(int i = 0;i<expectedNumCount;i++){
          if(!numSet.contains(i)){
            return i;
          }
        }
      return -1;
    }
}