class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int l = 0,r = 0;
        int n = nums.length;
        int []  output = new int[n-k+1];
        
        Deque<Integer> q = new LinkedList<>();
      
        while(r < n){
    //to remove smaller numbers in k range as smaller than a[i].
          while(!q.isEmpty() && nums[q.getLast()] < nums[r]){
            q.removeLast();
          }
          
          q.addLast(r);
          
          //to remove out of range elements.
          if(l > q.getFirst()){
            q.removeFirst();
          }
          
          if((r + 1) >= k){
            output[l] = nums[q.getFirst()];
            l++;
          }
          r++;
          
          
        }
      return output;
    }
}