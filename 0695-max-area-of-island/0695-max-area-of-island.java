class Solution {
    public boolean visited[][];
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        
        int m = grid.length;
        int n = grid[0].length;
        visited = new boolean[m][n];
        for(int i = 0;i < m;i++){
          for(int j = 0;j < n;j++){
            maxArea = Math.max(maxArea,solve(grid,i,j));
          }
        }
      return maxArea;
    }
  
    public int solve(int [][]grid , int i , int j){
      //base case
      if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || (grid[i][j] == 0)||visited[i][j]) return 0;
      
      visited[i][j] = true;
      
      return (1 + solve(grid,i+1,j) + solve(grid,i-1,j) + solve(grid,i,j+1) + solve(grid,i,j-1));
    }
}