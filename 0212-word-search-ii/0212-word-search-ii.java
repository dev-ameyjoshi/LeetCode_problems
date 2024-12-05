class Solution {
    private Node root;
    static class Node{
      Node [] links = new Node[26];
      boolean  isWord = false;
      
      boolean containsVal(char ch){
       return links[ch - 'a'] != null;
      }
      
      Node getVal(char ch){
        return links[ch - 'a'];
      }
      
      void put(char ch,Node node){
        links[ch - 'a'] = node;
      }
      
      void setEnd(){
        isWord = true;
      }
      
      boolean isEnd(){
        return isWord;
      }
     
      // public Node{
      //   root = new Node();
      // }
      
      public void addWord(String word){
        Node node = this;
        for(int i = 0; i < word.length();i++){
          if(!node.containsVal(word.charAt(i))){
            node.put(word.charAt(i), new Node());
          }
          node = node.getVal(word.charAt(i));
        }
         node.setEnd();
      }      
    }
  
  
  
    private Set<String> res;
    private boolean[][]visit;
  
    public List<String> findWords(char[][] board, String[] words) {
        
    Node root  = new Node();
    for(String word : words){
      root.addWord(word);
    }
    
    int rows = board.length,cols=board[0].length;
    res = new HashSet<>();
    visit = new boolean[rows][cols];

    for(int r = 0;r<rows;r++){
      for(int c = 0;c < cols;c++){
        dfs(board,r,c,root,"");
      }
    }
      return new ArrayList<>(res);
    }

    private void dfs(char[][]board,int r,int c,Node node,String word){
      int rows = board.length,cols = board[0].length;
      
      //Checking the bounds of the matrix
      
      if(r < 0 || c < 0 || r >= rows || c >= cols || visit[r][c] || !node.containsVal(board[r][c])){ //change containskey ka name and get func
        return;
      }

      visit[r][c] = true;
      node = node.getVal(board[r][c]);
      word += board[r][c];
      if(node.isWord){
        res.add(word);
      }

      dfs(board,r+1,c,node,word);
      dfs(board,r -1,c,node,word);
      dfs(board,r,c+1,node,word);
      dfs(board,r,c-1,node,word);
      
      visit[r][c] = false;
    }

}