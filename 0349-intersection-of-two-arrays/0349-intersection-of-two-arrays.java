class Solution {
    
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int N = nums1.length;
        int M = nums2.length;
        
        int start = 0;
        int end = 0;
        
        Set<Integer> intersection = new HashSet<>();
        
        while(start < N && end < M){
            if(nums1[start] == nums2[end]){
                intersection.add(nums1[start]);
                start++;
                end++;
            }else if(nums1[start] < nums2[end])
            {
                start++;
            }else
            {
                end++;
            }
        }
        
        int k = intersection.size();
        int [] result = new int[k];
        int curr = 0;
        for(int x : intersection){
            result[curr++] = x;
            
        }
        return result;
    }
}