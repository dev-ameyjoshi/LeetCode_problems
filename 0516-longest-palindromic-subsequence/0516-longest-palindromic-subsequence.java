class Solution {
    public int longestPalindromeSubseq(String s) {
        int m = s.length();
        String  p = new StringBuilder(s).reverse().toString();
        int n = p.length();
        int t[][] = new int[m+1][n+1];
        
        for(int  i = 1;i<=m;i++){
            for(int j = 1;j<=n;j++){
                if(s.charAt(i-1) == p.charAt(j-1))
                {
                    t[i][j] = 1 + t[i-1][j-1];
                }else{
                    t[i][j] = Math.max(t[i][j-1],t[i-1][j]);
                }
            }
                    

        }
        return t[m][n];
        
    }
}