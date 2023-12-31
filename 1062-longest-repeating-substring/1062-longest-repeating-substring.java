class Solution {
    public int longestRepeatingSubstring(String s) {
        int m = s.length();
        
        int t[][] = new int[m+1][m+1];
        
        // Initialization
        for(int i = 0;i<=m;i++){
            for(int j = 0;j<=m;j++){
                if(i == 0 || j == 0){
                    t[i][j] = 0;
                }
                
            }
        }
        
        int maxLen = 0;
        for(int i = 1;i<=m;i++){
            for(int j = 1;j<=m;j++){
                if(s.charAt(i-1) == s.charAt(j-1) && i!=j){
                    t[i][j] = t[i-1][j-1] + 1;
                    maxLen = Math.max(maxLen,t[i][j]);
                }else{
                    t[i][j] = 0;
                }
            }
        }
        
        return maxLen;
    }
}