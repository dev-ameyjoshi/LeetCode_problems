class Solution {
    public boolean isIsomorphic(String s, String t) {
        int [] newS = new int[200];
        int [] newT = new int[200];
        
        int len = s.length();
        
        if(len != t.length()) return false;
        
        for(int i = 0;i < len;i++){
            if(newS[s.charAt(i)] != newT[t.charAt(i)]){
                return false;
            }
            
            newS[s.charAt(i)] = i+1;
            newT[t.charAt(i)] = i + 1;
            
        }
        
        return true;
    }
}