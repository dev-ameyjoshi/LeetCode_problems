class Solution {
  
  //Longest and no repeating character
  //Longest substring with all unique character
  
  public int lengthOfLongestSubstring(String s) {
        
        HashMap<Character,Integer> mp = new HashMap<>();
        
        int count = 0;
        int i = 0, j = 0;
        // int ans = 0;
        int maxi = 0;
        int N = s.length();
       
        
        while(j < N){
            char ch = s.charAt(j);
            mp.put(ch,mp.getOrDefault(ch,0) + 1);
            
            while(mp.size() < j-i+1){
            int c = mp.get(s.charAt(i));
               
                    
                    if(c == 1){
                        mp.remove(s.charAt(i));
                        
                    }else{
                        mp.put(s.charAt(i),mp.get(s.charAt(i))-1);
                    }
                   
                
                i++;
            }
          //Instead of comparing it with given k we compare it j-i+1 for all distinct character
            if(mp.size() == j-i+1){ 
              
                maxi = Math.max(maxi,j-i+1);
                // j++;
                
            }
          j++;
        }
        
        return maxi;
    }

  
  
  
}