class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      int n = matrix.length;
      int m = matrix[0].length;
      if(n == 0) return false;
      
      int low = 0;
      int high = m*n-1;
      int pivotElement;
      while(low<=high){
        int mid = (low + high)/2;
        pivotElement = matrix[mid/m][mid%m];
        if(target == pivotElement) return true;
        else{
          if(target < pivotElement) high = mid - 1;
          else low = mid +  1;
        }
      }
      
      return false;
        
        
    }
}