class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int []ans = new int[n];
        Deque<Integer> stk = new ArrayDeque<>();
      
        for(int i = 0;i<n;i++){
          
          int currTemp = temperatures[i];
          while(!stk.isEmpty() && temperatures[stk.peek()] < currTemp){
            int prevDay = stk.pop();
            ans[prevDay] = i - prevDay;
          }
          stk.push(i);
        }
      
      return ans;
    }
}