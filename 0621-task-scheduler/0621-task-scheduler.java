class Solution {
    public int leastInterval(char[] tasks, int n) {
      //populating the charcter count in the count array
      int count[] = new int[26];
      for(char task : tasks){
        count[task - 'A']++;
      }
      //Creating PQ and reversing its order to get max PQ
 PriorityQueue<Integer> maxHp = new PriorityQueue<>(Collections.reverseOrder());
//Checking for cnt of characters in count frequency array and adding it if > 0
      for(int cnt : count){
        if(cnt > 0){
          maxHp.add(cnt);
        }
      }
      
      int time = 0;
      Queue<int[]> q = new LinkedList<>();
      
      while(!maxHp.isEmpty() || !q.isEmpty()){
        time++;
        if(maxHp.isEmpty()){
          time = q.peek()[1];
        }else{
          int cnt = maxHp.poll() -1;
          if(cnt > 0){
            q.add(new int[]{cnt,time + n});
          }
        }
        
        if(!q.isEmpty() && q.peek()[1] == time){
          maxHp.add(q.poll()[0]);
        }
      }
      
      return time;
      
    }
}