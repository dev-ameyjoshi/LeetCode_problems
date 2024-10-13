class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        
        while(start <= end){
          char c = s.charAt(start);
          char cb = s.charAt(end);
          
          if(!Character.isLetterOrDigit(c)){
            start++;
            continue;
          }
          
          if(!Character.isLetterOrDigit(cb)){
            end--;
            continue;
          }
          
          if(Character.toLowerCase(cb) != Character.toLowerCase(c)) return false;
          start++;
          end--;
        }
      
      return true;
    }
}