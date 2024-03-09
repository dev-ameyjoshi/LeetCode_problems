class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int start = 0;
        int sOne = 0;
        int end = nums1.length;
        int endN = nums2.length;
        
        while(start < end && sOne < endN){
            if(nums1[start] < nums2[sOne])  start++;
            else if(nums1[start] > nums2[sOne])  sOne++;
            else return nums1[start];            
        }
        
        return -1;
    }
}