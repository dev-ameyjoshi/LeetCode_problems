class Solution {
    
    
    
//     Get NSL function
    static int[] NearestSL(int nums[]){
        int n = nums.length;
        int left[] = new int[n];
        Stack <Integer> stk = new Stack<>();
        
        for(int i = 0;i<n;i++){
            
            if(stk.isEmpty()){left[i] = -1;}
            
            else if(!stk.isEmpty() && nums[stk.peek()] < nums[i]){
               left[i] =  stk.peek();
            }
            else{
                while(!stk.isEmpty() && nums[stk.peek()] >= nums[i]){
                    stk.pop();
                }
                if(stk.isEmpty()){left[i] = -1;}
                else{
                    left[i] = stk.peek();
                }
                
            }
            stk.push(i);
        }
        return left;
    }
//     Get NSR function
    static int[] NearestSR(int nums[]){
        int n = nums.length;
        int right[] = new int [n];
        Stack <Integer> stk = new Stack<>();
        
        for(int i = n-1;i>=0;i--){
            
            if(stk.isEmpty()){right[i] = n;}
            
            else if(!stk.isEmpty() && nums[stk.peek()] < nums[i]){
                right[i] = stk.peek();
            }
            else{
                while(!stk.isEmpty() && nums[stk.peek()] >= nums[i]){
                     stk.pop();
                }
                if(stk.isEmpty()){right[i] = n;}
                else{
                    right[i] = stk.peek();
                }
                
            }
            stk.push(i);
        }
        return right;
    }
//     Get Area function
    static int maxareahist(int heights[]){
        int n = heights.length;
        int left [] = NearestSL(heights);
        int right [] = NearestSR(heights);
        
        int max = Short.MIN_VALUE;
        
        for(int i = 0;i<n;i++){
            int width = right[i]-left[i]-1;
            int currArea = width*heights[i];
            max = Math.max(max,currArea);
        }
        return max;
        
    }
    
    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int []heights = new int[n];
        
        int max = Short.MIN_VALUE;
        
        
        for(int i = 0 ;i<m;i++){
            
            for(int j = 0 ;j<n;j++){
                if(matrix[i][j] == '1'){
                    heights[j] += 1;
                }else{
                    heights[j] = 0;
                }
                
            }
            int area = maxareahist(heights);
                max = Math.max(max,area);
        }
        return max;
    }
}