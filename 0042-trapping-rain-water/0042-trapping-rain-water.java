class Solution {
    public int trap(int[] height) {
        int start = 0;
        int end = height.length-1;
        int left = 0,right = 0;
        int ans = 0;
      
        while(start < end){
            if(height[start] < height[end]){
              left = Math.max(left,height[start]);
              ans += left- height[start];
              ++start;
            }else{
              right = Math.max(right,height[end]);
              ans+= right - height[end];
              --end;
            }
        }
      return ans;
    }
}