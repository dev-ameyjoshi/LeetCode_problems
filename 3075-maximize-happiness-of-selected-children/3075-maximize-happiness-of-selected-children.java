class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int happySize = happiness.length;
        
        Integer [] happyArray =  new Integer[happySize];
        
        for(int i = 0;i<happySize;i++){
            happyArray[i] = happiness[i];
        }
        
        Arrays.sort(happyArray,Collections.reverseOrder());
        
        long totalHappySum = 0;
        int turns = 0;
        
        for(int i = 0; i < k;i++)
        {
            totalHappySum += Math.max(happyArray[i] - turns,0);
            
            turns++;
        }
        
        return totalHappySum;
    }
}