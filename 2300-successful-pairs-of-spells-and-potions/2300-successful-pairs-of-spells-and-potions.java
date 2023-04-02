class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        int[] pairs = new int[n];
        
       Arrays.sort(potions);
       
        for(int i = 0;i<n;i++){
            int l = 0;
            int h = m-1;
            int spell = spells[i];
            while(l <= h){
                int mid = l + (h-l)/2;
                long product = (long) spell *potions[mid];
                if(product>=success){
                    h = mid -1;
                }else {
                    l = mid +1;
                }
            }
            
            pairs[i] = m - l;
        }
        return pairs;
    }
}