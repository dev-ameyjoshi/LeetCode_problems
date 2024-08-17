class Solution {
    public long maxPoints(int[][] points) {
        int m = points.length;
        int n = points[0].length;
        long[] prevRow = new long[n];
      
        for(int i = 0;i < n;++i){
          prevRow[i] = points[0][i];
        }
      
        //Processing each row for calculation
        for(int r = 0; r < m-1;++r){
          long[] leftMax = new long[n];
          long[] rightMax = new long[n];
          long[] currentRow = new long[n];
          
          //Caculateing left to right max
          leftMax[0] = prevRow[0];
        
          for(int i = 1;i<n;++i){
            leftMax[i] = Math.max(leftMax[i-1] -1,prevRow[i]);
          }
          
          //Caculating right to left
          rightMax[n-1] = prevRow[n-1];
          
          for(int j = n-2;j >= 0;--j){
            rightMax[j] = Math.max(rightMax[j+1]-1,prevRow[j]);
          }
          
          for(int j = 0;j<n;++j){
            currentRow[j] = points[r+1][j] + Math.max(leftMax[j],rightMax[j]);
          }
          prevRow = currentRow;
        }
      long maxPoints = 0;
      for(int i = 0;i<n;++i){
        maxPoints = Math.max(maxPoints,prevRow[i]);
      }
      
      return maxPoints;
      
        
      
    }
}