class Solution {
   
    
    int t[][] = new int[3][1001];
    public int twoEggDrop(int n) {
        
        int e = 2;
        int f = n;
        
        for(int i = 0;i<t.length;i++){
            Arrays.fill(t[i],-1);
        }
        
        
        return solve(e,f);   
    }
    
    public int solve(int e,int f){
        if(f == 0 || f == 1) return f;
        
        if(e == 1) return f;
        
        if(t[e][f] != -1) return t[e][f];
       
        int mn = Integer.MAX_VALUE;
        
        for(int k = 1;k<=f;k++){
        int high;
        int low;
            
            int temp=1+Math.max(solve(e-1,k-1),solve(e,f-k));

            mn = Math.min(mn,temp);
        }
        t[e][f] = mn;
        return mn;
    }

}