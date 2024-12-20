class Solution {
    public int [] x = {-1,0,1,0};
    public int [] y = {0,1,0,-1};
  
    public int numIslands(char[][] grid) {
      int m = grid.length;
      int n = grid[0].length;
      
      if(grid == null || m == 0) return 0;
      
      int count = 0;
      
           for(int i = 0; i < m;i++){
            for(int j = 0;j < n;j++){
              if(grid[i][j] == '1'){
                dfs(grid,i,j);
                count++;
              }
            }
           }
         return count;
    }
    
    public void dfs(char [][]grid , int i , int j){
      //base case 
      if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1'){
        return;
      }
      grid[i][j] = '0';
      for(int k = 0;k < 4;k++){
        int ii = i + x[k], jj = j + y[k];
        dfs(grid,ii,jj);
      }       
        
    }
}