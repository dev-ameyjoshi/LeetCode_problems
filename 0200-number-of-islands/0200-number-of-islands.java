class Solution {
    
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        if(grid == null || m == 0){
            return 0;
        }
        
        int count = 0;
        
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j] == '1'){
                    count++;
                    dfs(grid,i,j);
                }
            }
        }
        
        return count;
        
    }
    private void dfs(char [][] grid,int i,int j){
        //base case
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1'){
            return;
        }
        
        grid[i][j] = '0';
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }
}