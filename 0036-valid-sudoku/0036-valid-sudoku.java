class Solution {
    public boolean isValidSudoku(char[][] board) {
   
      
      int n = 9;
      HashSet<Character> [] rows = new HashSet[9];
      HashSet<Character> [] cols = new HashSet[9];
      HashSet<Character> [] submat = new HashSet[9];
      
      for(int i = 0;i<n;i++){
        rows[i] = new HashSet<Character>();
        cols[i] = new HashSet<Character>();
        submat[i] = new HashSet<Character>();
      }
      
      for(int i = 0;i<n;i++){
        for(int j = 0;j<n;j++){
          char val = board[i][j];
          
          if(val == '.') continue;
          
          if(rows[i].contains(val)) return false;
          rows[i].add(val);
          
          if(cols[j].contains(val)) return false;
          cols[j].add(val);
          
          int idx = (i/3) *3 + (j/3);
          
          if(submat[idx].contains(val)) return false;
          submat[idx].add(val);
        }
      }
      
      return true;
    }
}