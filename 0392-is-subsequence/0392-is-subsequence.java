class Solution {
    public boolean isSubsequence(String s, String t) {
        int m = s.length();
        int n = t.length();
        
        if(m == 0) return true;
        
        int [][] tt = new int[m+1][n+1];
        
        for(int i = 1;i<=m;i++){
            for(int j = 1;j<=n;j++){
                if(s.charAt(i-1) == t.charAt(j-1)){
                    tt[i][j] = 1+ tt[i-1][j-1];
                }else{
                    tt[i][j] = Math.max(tt[i][j-1],tt[i-1][j]);
                }
            }
        }
        
        ;
        
        if(tt[m][n] == m){
            return true;
        }
            return false;
        
    }
}