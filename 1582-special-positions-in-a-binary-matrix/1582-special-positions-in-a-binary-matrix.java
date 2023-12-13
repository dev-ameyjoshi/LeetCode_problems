class Solution {
    public int numSpecial(int[][] mat) {
        int []m = new int [mat.length];
        int []n = new int [mat[0].length];
        int x = mat.length;
        int y = mat[0].length;
        
        
        
        for(int i = 0;i<x;i++){
            for(int j = 0;j<y;j++){
                if(mat[i][j] == 1){
                    m[i]++;
                    n[j]++;
                
            }
        }
        }
        int ans = 0;
        for(int i = 0;i<x;i++){
            for(int j = 0;j<y;j++){
               if(mat[i][j] == 1 && m[i] == 1 && n[j] == 1 ){
                   ans++;
               }
        }
        }
        return ans;
        
        
    }
}