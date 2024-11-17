class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();
        int cnt = 0;
        int maxLen = Integer.MAX_VALUE;
        int l = 0;
        int sIndex = -1;
      
  HashMap<Character,Integer> map = new HashMap<>();
        
       for(int i = 0; i < m; i++){
          map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
       }
      
      for(int r = 0;r<n;r++){
        if(map.getOrDefault(s.charAt(r),0) > 0) cnt++;
        
        map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)-1);
        
        while(cnt == m){
          if(r - l + 1 < maxLen){
            maxLen = r - l + 1;
            sIndex = l;
          }
          
          map.put(s.charAt(l),map.getOrDefault(s.charAt(l),0) + 1);
          
          if(map.get(s.charAt(l)) > 0) cnt--;
          
          l++;
        }
        
         
      }
      
        if(sIndex == -1) return "" ;
        return s.substring(sIndex,sIndex + maxLen);
      
    }
}