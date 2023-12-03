class Solution {
    public int coinChange(int[] coins, int amount) {
//         base declrations
        int c = coins.length;
       
        int z = Integer.MAX_VALUE; //Common Practice to represent max value 
//         used to initialize the first row with a large value.

        
//        Unbounded Knapsack Implementation
        
        
//         return statement 
        
        int [][]t = new int[c+1][amount+1];
        
        //        Initializing the matrix array
        for(int i = 0;i<=c;i++){
            for(int j = 0;j<=amount;j++){
                if(i == 0){
                    t[i][j] = z-1; //no coins
                }
                if(j == 0){
                    t[i][j] = 0; // no amount 
                }
                if(i == 1){
                    if(j%coins[0] == 0) t[i][j] = j/coins[0];
                    else t[i][j] = z-1;
                }
            }
        }
            
        for(int i = 2;i<=c;i++){
            for(int j = 1;j<=amount;j++){
                if(coins[i-1]<=j){
                    t[i][j] = Math.min(t[i-1][j] ,1+ t[i][j-coins[i-1]]);
                    
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
           return t[c][amount]<z-1 ? t[c][amount]: -1; 
        
        }
    }
