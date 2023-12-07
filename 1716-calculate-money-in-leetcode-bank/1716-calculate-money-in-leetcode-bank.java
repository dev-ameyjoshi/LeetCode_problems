class Solution {
    // Method 1
    // public int totalMoney(int n) {
    //     int ans = 0;
    //     int monday = 1;  
    //     while(n>0){
    //         for(int i = 0;i< Math.min(n,7);i++){
    //         ans+=monday+i;
    //     }
    //         n-=7;
    //         monday++;
    //     }
    //     return ans;
    // }
    public int totalMoney(int n) {
       
       // Initialization
        int div = n/7;
        int rem = n%7;
        int start = 1;
        int sum = 0;
        
        // Gauss Theorem formula to calculate sum and start value
        // iteration happens until value div is reached
        for(int i = 0;i<div;i++){
            int end  = start +6;
            int temp = ((start+end)*7)/2;
            sum+=temp;
            
            start++;
        }
        
        // To calculate the remaing days
        // iteration happens until value rem is reached
        for(int i = 0;i<rem;i++){
            sum+=start++;
        }
        return sum;
    }
}
