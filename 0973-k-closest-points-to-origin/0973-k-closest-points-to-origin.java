class Solution {
    class Pair{
      int distance,x,y;
      Pair(int distance,int x,int y){
        this.distance = distance;
        this.x = x;
        this.y = y;
      }
      
    }
    
    public int[][] kClosest(int[][] points, int k) {
    // using the formula for distance between 2 points _/x^2 + y^2
      PriorityQueue<Pair> maxh = new PriorityQueue<>((a,b) -> b.distance - a.distance);
      
   
      int arr [][] = new int [k][points[0].length]; 
     
      int idx = 0;
      for( int []temp : points){
        
        int distance = temp[0]*temp[0] + temp[1]*temp[1]; 
        maxh.add(new Pair(distance,temp[0],temp[1]));
        
        if(maxh.size()> k) maxh.poll();    
            
      }
      
      
      while(!maxh.isEmpty()){
        int xCoordinate = maxh.peek().x;
        int yCoordinate = maxh.peek().y;
        arr[idx][0] = xCoordinate;
        arr[idx][1] = yCoordinate;
        idx++;
        maxh.poll();
      }
      return arr;
        
    }
}