class Solution {
    static int t[][] = new int[501][501];
    public int maxSumAfterPartitioning(int[] arr, int k) {
           int n = arr.length;
           int i = 0; int j = n-1;
        
           for(int []row : t){
           Arrays.fill(row,-1);
           }
           return solve(arr,i,j,k,t);
           
    }
    
    public int solve(int arr[],int i, int j,int kk,int [][]t){
        int min = 0;
        // base cases
        if(t[i][j] != -1){
            return t[i][j];
        }
        
        if(i>j) return 0;
        
        if(i == j){
            return arr[i];
        }
        // To sum the values that fit k value itself
        // j-i+1 represents length of subarray
        if(j-i+1 == kk){
            int maxCurr = 0;
            for(int l = i;l<=j;l++){
                maxCurr = Math.max(maxCurr,arr[l]);
            }
            return (j-i+1) * maxCurr;
        }
        // For values that arent equal to k (given).
        if(j-i+1 < kk){
            int maxCurr = 0;
            for(int l = i;l<=j;l++){
                maxCurr = Math.max(maxCurr,arr[l]);
            }
            return (j-i+1)*maxCurr;
        }
        
        for(int k = i;k<i+kk & k<j;k++){
            min  = Math.max(min,solve(arr,i,k,kk,t) + solve(arr,k+1,j,kk,t));
        }
        
        t[i][j]=min;
        return min;
    }
}