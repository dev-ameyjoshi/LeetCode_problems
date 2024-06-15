class Solution {
    public int totalFruit(int[] fruits) {
      //continuesly in an array so we can conclude that it has subarray 
      //
      
      //Initialiation
      int n = fruits.length;
      int i = 0,j = 0;
      int ans = Integer.MIN_VALUE;
      int types = 2;
      HashMap <Integer,Integer> mp = new HashMap<>();
      
      while(j < n)
      {
        
        mp.put(fruits[j],mp.getOrDefault(fruits[j],0) + 1);

        if(mp.size() <= types){
          ans = Math.max(j-i+1,ans);
          j++;
        } else if(mp.size() > types)
        {
          while(mp.size() > types)
          {
            mp.put(fruits[i],mp.get(fruits[i])-1);
            if(mp.get(fruits[i]) == 0){
              mp.remove(fruits[i]);
            }
            i++;
          }
          j++;
        }
      }
      
        if(ans == Integer.MIN_VALUE)
        {
          return 0;
        }
        return ans;
      }
      
    
}