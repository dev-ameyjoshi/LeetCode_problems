/**
 * // This is ArrayReader's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface ArrayReader {
 *     public int get(int index) {}
 * }
 */

class Solution {
    
    public int binS(ArrayReader reader,int start , int end , int target)
    {
        while(start<= end){
            int mid = start + (end-start)/2;
            
            if(reader.get(mid) == target) return mid;
            else if(target > reader.get(mid)) start = mid+1;
            else if(target < reader.get(mid)) end = mid-1;
            
        }
        return -1;
    }
    public int search(ArrayReader reader, int target) {
        int start  = 0;
        int end = 1;
        
        if (reader.get(0) == target) return 0;
        
        while(reader.get(end) < target){
            start = end;
            end = end *2;
        }
        
        int res = binS(reader,start,end,target);
        return res;
        
    }
}