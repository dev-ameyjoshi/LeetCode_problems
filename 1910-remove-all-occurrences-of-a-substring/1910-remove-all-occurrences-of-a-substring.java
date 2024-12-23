class Solution {
    public String removeOccurrences(String s, String part) {
        Stack<Character> stk = new Stack<>();
        
        for(char c : s.toCharArray()){
          stk.push(c);
          if(stk.size() >= part.length() && stk.peek() == part.charAt(part.length()-1)){
            StringBuilder temp = new StringBuilder();
            for(int i = 0;i < part.length();i++){
              temp.append(stk.pop());
            }
            temp.reverse();
            if(!temp.toString().equals(part)){
              for(char ch : temp.toString().toCharArray()){
                stk.push(ch);
              }
            }
          }
        }
      
      StringBuilder ans = new StringBuilder();
      while(!stk.isEmpty()){
        ans.append(stk.pop());
      }
      
      return ans.reverse().toString();
    }
}