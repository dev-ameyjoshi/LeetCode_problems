class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        
        int end = tickets.length;        
        
        int count = 0;
        
        if(tickets[k] == 1) return k + 1;
        
        while(tickets[k] > 0){
            for(int i = 0;i < end ; i++){
            if(tickets[i] != 0){
                tickets[i]--;
                count++;
            }
                if(tickets[k] == 0) return count;
        }
        
        
        }
        
        return count;
    }
}