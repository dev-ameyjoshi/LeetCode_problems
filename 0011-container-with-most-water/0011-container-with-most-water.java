class Solution {
    public int maxArea(int[] height) {
        int s = 0;
        int e = height.length-1;
        int maximumArea = 0;
      
      while(s < e){
        int width = e - s;
        maximumArea = Math.max(maximumArea,Math.min(height[s],height[e]) * width);
  
        if(height[s] <= height[e]){
          s++;
        }else{
          e--;
        } 
      }
      
      return maximumArea;
    }
}