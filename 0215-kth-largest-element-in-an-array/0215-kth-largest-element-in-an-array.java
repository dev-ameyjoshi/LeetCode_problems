class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        
        PriorityQueue<Integer> maxh = new PriorityQueue<>();
        for(int i = 0;i<n;i++){
          maxh.add(nums[i]);
          if(maxh.size() > k){
            maxh.poll();
          }
        }
      return maxh.peek();
    }
}