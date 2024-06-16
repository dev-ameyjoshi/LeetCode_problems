class Solution {
    public String minWindow(String s, String t) {
      int i = 0,j = 0;
      int n = s.length();
      int minV = Integer.MAX_VALUE;
      int minStart = 0;
      HashMap <Character,Integer> mp = new HashMap<Character,Integer>();
      int reqChar = t.length();
      
      //base conditions
      if(s == null || s.length() == 0 || t == null || t.length() == 0){
        return "";
      }
      
      for(char c : t.toCharArray()){
     
         mp.put(c,mp.getOrDefault(c,0) + 1);
      }
     
      while(j < n){
        //To set and initialize the count to 0
         char currChar = s.charAt(j);
        
        if(mp.containsKey(currChar)){
          if(mp.get(currChar) > 0){
            reqChar--;
          }
          mp.put(currChar,mp.get(currChar) - 1);
        }
        
        while(reqChar == 0){
          if(j-i+1 < minV){
            minV = j-i+1;
            minStart = i;
          }
          
          char leftChar = s.charAt(i);
          if(mp.containsKey(leftChar)){
            mp.put(leftChar,mp.get(leftChar) + 1);
            if(mp.get(leftChar)>0){
              reqChar++;
            }
          }
          
          i++;
          
          
        }
        
        j++;
       
      }
      
      
      return (minV == Integer.MAX_VALUE) ? "" : s.substring(minStart,minStart + minV); 
      
    }
}