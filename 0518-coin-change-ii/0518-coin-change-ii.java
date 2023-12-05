class Solution {
    public int change(int amount, int[] coins) {
         int n = coins.length;
         // int x = Integer.MAX_VALUE;
        
//         initialising matrix

         int t[][] = new int[n+1][amount+1];

            for(int i = 0;i<=n;i++){
                for(int j=0;j<=amount ;j++){
                   if(i == 0){
                       t[i][j] = 0;
                   }
                    if(j == 0){
                       t[i][j] = 1;
                    }
                    // if(i==1){
                    //   if(j%coins[0]==0) t[i][j] = j/coins[0];
                    //     else t[i][j] = x-1;
                    // }
                }
            }
        
            for(int i = 1;i<=n;i++){
                for(int j = 1;j<=amount;j++){
                    if(coins[i-1]<=j){
                        t[i][j] = t[i-1][j]+t[i][j-coins[i-1]];
                    }else{
                        t[i][j] = t[i-1][j];
                    }
                }
            }
        
        return t[n][amount];
    }
    }