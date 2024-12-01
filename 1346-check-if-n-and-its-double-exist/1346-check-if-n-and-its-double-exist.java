class Solution {
  public boolean checkIfExist(int[] arr) {
       Arrays.sort(arr);
      
      for(int i = 0;i<arr.length;i++){
        int target = 2 * arr[i];
        
        int index = binarySearch(arr,target);
        if(index >= 0 && index != i){
          return true;
        }
      }
        return false; 
    }
  private int binarySearch(int arr[],int target){
     //arr[i] = 2 * arr[j]

      int start = 0;
      int end = arr.length-1;
      
      while(start <= end){
        int mid = start + (end - start )/2;
        
      if(arr[mid] == target) return mid;  
      else if(arr[mid] < target) start = mid + 1;
      else end = mid - 1;
        
      
      
  }
    return -1;
  }
    
}