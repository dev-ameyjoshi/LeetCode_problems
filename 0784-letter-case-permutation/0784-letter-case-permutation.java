class Solution {
    public  List<String> solve(String ip, String op, List<String> v){
        if(ip.length() == 0){
            v.add(op);
            return v;
        }
        
        char ch = ip.charAt(0);
        String ros = ip.substring(1);
        
        String op1 = op ;
        String op2 = op ;
        if(Character.isAlphabetic(ch)){
            op1 +=  Character.toLowerCase(ip.charAt(0));
            op2 +=  Character.toUpperCase(ip.charAt(0));
            
            solve(ros,op1,v);
            solve(ros,op2,v);
        }else{
            op1 += ip.charAt(0);
            // String op1 = ("" + ch.upperCase());
            solve(ros,op1,v);
        }
        return v;
    }
    public List<String> letterCasePermutation(String s) {
        String ip = s;
        String op = "";
        
        List<String> v = new ArrayList<String>();
        return solve(ip,op,v);        
    }
}