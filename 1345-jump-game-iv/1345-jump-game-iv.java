class Solution {
    public int minJumps(int[] arr) {
        
        //base case and variable.
        int n = arr.length;
        if(n==1) return 0;
        
        //creating map holding and integer list.I.e hashmap and list.
        
        Map<Integer,List<Integer>> map = new HashMap<>();
        int step = 0; // initial jumps is 0
        
        //We have to first fill the map 
        for(int i = 0;i<n;i++){
            
        //so we check if arr[i] is present or not, if present new arraylist is created.
        //If already exists then index is added in it.
         map.computeIfAbsent(arr[i], v-> new ArrayList()).add(i);
        }
        
        //next we will need a queue
        Queue<Integer> q = new LinkedList<>();
        q.offer(0);//TO initialize our first index as 0.
        
        while(!q.isEmpty()){          //Looping until queue is not empty.
            step++;                   // incrementing our steps or jumps.
            int size = q.size();      // taking queue size/
            for(int i = 0;i<size;i++){//iteration for the queue of size method.
                int j = q.poll();     //getting element from queue.
                
                
                //Jump from j-1
                if(j-1 >= 0 && map.containsKey(arr[j-1])){
                    q.offer(j-1);
                    
                }
                
                //Jump from j+1
                   if(j+1 < n && map.containsKey(arr[j+1])){
                       if(j+1 == n-1) return step; // if j+1 is the last step then return the step.
                       q.offer(j+1);
                   }
                   
                   if(map.containsKey(arr[j])){
                       for(int k : map.get(arr[j])){
                           if(k!= j){
                               if(k == n-1) return step;
                               q.offer(k);
                           }
                       }
                   }
                   
                   map.remove(arr[j]);
            }
        }
        
        return step;
        
    }
}