class Solution {
    public boolean checkValidString(String s) {
       
        
    Stack<Integer> bracketStack = new Stack<>();
    Stack<Integer> asterixStack = new Stack<>();
    
    char [] arr = s.toCharArray();
        
    for(int i = 0;i<arr.length;i++){
        char ch = arr[i];
        
        if(ch == '(') bracketStack.push(i);
        else if(ch == '*') asterixStack.push(i);
        else if(!bracketStack.isEmpty()) bracketStack.pop();
        else if(!asterixStack.isEmpty()) asterixStack.pop();
        else return false;
    }
        
    while(!bracketStack.isEmpty() && !asterixStack.isEmpty() && bracketStack.peek()<asterixStack.peek()){
        bracketStack.pop();
        asterixStack.pop();
    }
        return bracketStack.isEmpty();
    }
}