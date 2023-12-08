class Solution {
//     Recursive Method works but TLE.
//      private static int lcs( String text1, String text2, int m, int n){
                
        
//         //         Base Condition
//                 if(n == 0 || m == 0) return 0;
//         //         Choice Diagram
//                 if (text1.charAt(m-1) == text2.charAt(n-1)){
//                      return 1 + lcs(text1,text2,m-1,n-1);
//                 }
               
//                 else return Math.max(lcs(text1,text2,m,n-1),lcs(text1,text2,m-1,n));
//              }
    
    //  public int longestCommonSubsequence(String text1, String text2) {
    //             int m = text1.length();
    //             int n = text2.length();
    //             return lcs(text1,text2,m,n);
    // }
    
    
    public int longestCommonSubsequence(String text1, String text2) {
        
        int m = text1.length();
        int n = text2.length();

        
       int[][] t = new int[m+1][n+1];
        
        // if(n == 0 || m == 0) return 0;
        
        for(int i = 1;i<m+1;i++){
            for(int j = 1;j<n+1;j++){
               if(text1.charAt(i-1) == text2.charAt(j-1)){
                   t[i][j] = 1+t[i-1][j-1];
               }else{
                   t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
               }
            }
        }
        return t[m][n];
    }
    
}