class Solution {
    public boolean isAnagram(String s, String t) {
      // Steps:
      // 1.length check
      if(s.length() != t.length()) return false;

      //2.Create the hashmap
        HashMap<Character,Integer> map = new HashMap<>();
  
      //3.populate the hashmap
      for(int i = 0;i<s.length();i++){
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0) + 1);
        map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0) - 1);
      }
      //4.check the hashmap values:
      for(char c: map.keySet()){
        if(map.get(c) != 0) return false;
      }
      
      //5.return true as all conditions are satisfied.
      return true;
    }
}