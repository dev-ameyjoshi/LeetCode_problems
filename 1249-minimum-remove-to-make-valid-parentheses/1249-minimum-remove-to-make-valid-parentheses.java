class Solution {
    public String minRemoveToMakeValid(String s) {
        int start = 0;
        int end = s.length() -1 ;
        
        String result;
        
        char [] arr = s.toCharArray();
        int l = arr.length;
        
        int openPCount = 0;
        
        for(int i = 0; i < l;i++){
            if(arr[i] == '('){
                openPCount++;
            }else if(arr[i] == ')'){
                if(openPCount == 0){
                    arr[i] = '*';
                }else{
                    openPCount--;
                }
            }
        }
        
        for(int i = l-1;i>=0;i--){
            if(openPCount > 0 && arr[i] == '('){
                arr[i] = '*';
                openPCount--;
            }
        }
        
        int  p = 0;
        for(int i = 0;i<l;i++){
            if(arr[i] != '*'){
                arr[p++] = arr[i];
            }
        }
        
        result = new String(arr).substring(0,p);
        
        return result;        
        
        
    }
}