class Solution {
    public List<String> Solve(int opn , int cl , String op , List<String> v){
        
        //Base Condition 
        if(opn == 0 && cl == 0){
            v.add(op);
            return v;
        }
        
        //Condition for open bracket that is 
        
        if(opn != 0){
            String op1 = op;
            op1+="(";
            Solve(opn-1,cl,op1,v);
        }
        
        //Condtn for closed bracket
        if(cl > opn){
            String op2 = op;
            op2+=")";
            Solve(opn,cl-1,op2,v);
        }
        return v;
    }
    public List<String> generateParenthesis(int n) {
        List<String> v = new ArrayList<>();
        String op = "";
        int opn = n;
        int cl  = n;
        Solve(opn,cl,op,v);
        return v;
    }
}