class Solution {
    public static int t[][];
    public int superEggDrop(int k, int n) {
       
        t = new int[k+1][n+1];
        
        for(int i = 0;i<t.length;i++){
            Arrays.fill(t[i],-1);
        }
        
        return solve(k,n);   
    }
    
    public int solve(int k,int n){
        if(n == 0 || n == 1 ||k == 1 ) return n;
        
        if(t[k][n] != -1) return t[k][n];
       
        int mn = Integer.MAX_VALUE,l=1,h=n;
//         using binary search
        
        while(l<=h){
            int mid = (h+l)/2;
            int left = solve(k-1,mid-1);
            int right = solve(k,n-mid);
            int temp = 1 + Math.max(left,right);
            if(left<right) l = mid+1;
            else h = mid-1;
            
            
            mn = Math.min(mn,temp);
        }
        t[k][n] = mn;
        return mn;
    }

}