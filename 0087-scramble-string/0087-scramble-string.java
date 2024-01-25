class Solution {
    public boolean isScramble(String s1, String s2) {
        
       
        if(s1.isEmpty() && s2.isEmpty()) return true;
        HashMap<String,Boolean> hm = new HashMap<>();
        return isScrambled(s1,s2,hm);
       
    }
    
    private boolean isScrambled(String s1,String s2,HashMap hm){
         if(s1.equals(s2)) return true;
        if(s1.length() <= 1) return false;
        int n  = s1.length();
        String key = s1+" "+s2;
        if(hm.containsKey(key)){
            return (boolean)hm.get(key);
        }
        
        boolean flag = false;
        
        for(int i = 1;i<n;i++){
        
                
          if(isScrambled(s1.substring(0,i) , s2.substring(n-i,n),hm) && isScrambled(s1.substring(i,n),s2.substring(0,n-i),hm)){
                     flag = true;
                    break;
                }
            if(isScrambled(s1.substring(0,i) , s2.substring(0,i),hm) && isScrambled(s1.substring(i),s2.substring(i),hm)){
                     flag = true;
                    break;
                }
        }
        hm.put(key,flag);
        return flag;
    }
}