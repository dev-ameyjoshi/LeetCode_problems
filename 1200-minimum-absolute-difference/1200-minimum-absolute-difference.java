class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
      
        Arrays.sort(arr);
        List<List <Integer>> al = new ArrayList();
        int n = arr.length;
        int min = Integer.MAX_VALUE;
      
      
        for(int i = 0;i<n-1;i++){
          min = Math.min(min,arr[i+1] - arr[i]);  
        }
      
        for(int i = 0;i<n-1;i++){
          if(arr[i+1] - arr[i] == min){
            al.add(Arrays.asList(arr[i],arr[i+1]));
          }
        }
      
      return al;
    }
}