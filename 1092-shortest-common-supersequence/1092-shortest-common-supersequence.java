class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
       
        // Base Condition
        int m = str1.length(); int n = str2.length();
        
        int t[][] = new int[m+1][n+1];
        
        int i = 0;
        int j = 0;
        //Lowest Common Subsequence - top down approach
        for(i = 1;i<m+1;i++){
            for( j = 1;j<n+1;j++){
               if(str1.charAt(i-1) == str2.charAt(j-1))
                        t[i][j] = 1+ t[i-1][j-1];
                else{
                    t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
                }
                }
            }
        
    
            //Printing the LCS
        i = m;
        j = n;
            StringBuilder s = new StringBuilder();
            while(i>0 && j>0){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                s.append(str1.charAt(i-1));
                i--;
                j--;

            }else{
                if(t[i-1][j]>t[i][j-1]){
                    s.append(str1.charAt(i-1));
                    i--;
                }else{
                    s.append(str2.charAt(j-1));
                    j--;
                }


            }

          }
             while(i>0){
                    s.append(str1.charAt(i-1));
                    i--;
                }
                while(j>0){
                    s.append(str2.charAt(j-1));
                    j--;
                }
                return s.reverse().toString();
        }
    }