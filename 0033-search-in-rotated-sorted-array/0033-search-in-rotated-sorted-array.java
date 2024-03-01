class Solution {
    
    //Method 1 of BS to find for index : minelement  - 1 , using regular BS algo.
    static int bsOne(int [] nums,int index,int end,int target){
        while(index<=end){
            int mid = index + (end-index)/2;
            
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target){
                index = mid+1;
            }else{
                end = mid - 1;
            }
            
        }
        return -1;
    }
    
    static int minElement(int []nums , int start , int end,int target,int n){
        
        
        if(n == 1) return 0;
        
        while(start<=end){
            int mid = start + (end-start)/2;
            
            //to be able to find min element it has to be smaller than its neighbouring elements
            int next = (mid+1)%n;
            int prev = (mid+n-1)%n;
            
            //To check if the element is already sorted or not
            if(nums[mid] <= nums[end] && nums[mid] >= nums[start]) return start;
            //To check if the element is smaller than the prev and next element             
            else if(nums[mid] < nums[next] && nums[mid] < nums[prev]) return mid;
            //To search for the element in the half, where the element is present.
            //And we usually  look for unsorted part of the array 
            else if(nums[end] < nums[mid]){
                //First Binary search method.
                start = mid + 1;
            }else{
                //Second Binary Search Method.
                end = mid - 1;
            }
             
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        //using our regular algo of binary search to find the min element 
        int start = 0;
        int n =nums.length;
        int end  = n-1;
        
        int minIndex = minElement(nums,start,end,target,n);
        
        int res1 = bsOne(nums,0,minIndex-1,target);
        int res2 = bsOne(nums,minIndex,end,target);
        
        if(res1 == res2) return -1;
        if(res1 != -1) return res1;
        else return res2;
        
    }
}