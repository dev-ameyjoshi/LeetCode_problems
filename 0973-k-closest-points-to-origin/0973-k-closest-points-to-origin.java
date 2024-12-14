class Solution {
    public int[][] kClosest(int[][] points, int k) {
PriorityQueue<int[]> maxHp = new PriorityQueue<>((a,b) -> Integer.compare(b[0] *b[0] + b[1] *b[1], a[0] * a[0] + a[1] * a[1]));
      
      for(int [] point : points){
        maxHp.offer(point);
        if(maxHp.size() >  k){
          maxHp.poll();
        }
      }
      
      int [][] res = new int[k][2];
      int i = 0;
      
      while(!maxHp.isEmpty()){
        res[i++] = maxHp.poll();
      }
      return res;
    }
}