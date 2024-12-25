class Solution {
    /*
    -1 is wall
    0 is gate
    INF -> Integer.MAX_VALUE
    distance to gate < INF
     
    
    */
    private int [][]directions = {{1,0} , {-1,0} , {0,1}, {0,-1}};
    private int INF = 2147483647;
    private int m,n;
  
    public boolean visited[][];
  
    private int bfs(int [][] rooms , int i , int j){
      Queue<int[]> q = new LinkedList<>();
      q.add(new int []{i,j});
      visited = new boolean[m][n];
      visited[i][j] = true;
      int steps = 0;
      
      while(!q.isEmpty()){
        int size = q.size();
        for(int k = 0;k < size;k++){
          int curr[] = q.poll();
          int row = curr[0],col = curr[1];
          if(rooms[row][col] == 0) return steps;
          for(int [] dir : directions){
            int nr = row + dir[0],nc = col + dir[1];
            if(nr >= 0 && nr < m && nc >= 0 && nc < n && !visited[nr][nc] && rooms[nr][nc] != -1){
              visited[nr][nc] = true;
              q.add(new int[]{nr,nc});
            }
          }
        }
        
        steps++;
      }
      return INF;
    }
    public void wallsAndGates(int[][] rooms) {
           m = rooms.length;
           n = rooms[0].length;
          
          visited = new boolean[m][n];
          for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
              if(rooms[i][j] == INF){
                rooms[i][j] = bfs(rooms,i,j);
              }
            }
          }
    }
}