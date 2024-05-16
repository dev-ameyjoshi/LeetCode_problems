class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
         PriorityQueue<Integer> maxh = new PriorityQueue<>((a,b) -> Math.abs(x-a) != Math.abs(x-b) ? 
                                                        Math.abs(x-b) - Math.abs(x-a): b-a);
        
        for(int i = 0;i<arr.length;i++){
          maxh.add(arr[i]);
          if(maxh.size() > k){
            maxh.poll();
          }
        }
      List<Integer>  out = new ArrayList<>(maxh);
      Collections.sort(out);
      return out;
    }
}