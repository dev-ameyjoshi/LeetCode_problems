class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Task : grp the anagrams together.
      // Steps:
      
      //Base case if length = 0
      if(strs.length == 0) return new ArrayList();
      //2.create a new map , string list mapping.
      Map <String,List> ans = new HashMap<String,List>();
      //iterate through the loop 
      for(String s : strs){
      // convert string to char
        char ca[] = s.toCharArray();
      //sort the char array
        Arrays.sort(ca);
      //string key = value of that char array
        String key = String.valueOf(ca);
      //if map does not contain key values then add em
      //get the key and add the ans
        if(!ans.containsKey(key)) ans.put(key, new ArrayList());
        ans.get(key).add(s);
      }
      
      //return new arraylist with its values grouped as string
      return new ArrayList(ans.values());
            
    }
}