class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        // n workers , quality and wage array is given to us.
        //  k  workers from a paid group.
        // must be paid at least their minimum expection.
        //  wage proportional to their quality.
        // if quality is 2x then wage is also *2
        // return the least amount of money needed to form a paid group.
        // answers between 10^-5
        
      
      int n  = quality.length;
      double totalCost = Double.MAX_VALUE;
      double currentTotalQuality = 0;
      List<Pair<Double,Integer>> wageToQualityRatio = new ArrayList<>();
       
      
      //To calulate the wage to quality ratio for each worker.
      for(int i = 0;i < n ; i++){
        wageToQualityRatio.add(new Pair<>((double) wage[i] /quality[i],quality[i]));
      }
      
      //Sort workers based on their wage to quality ratio 
      Collections.sort(wageToQualityRatio,Comparator.comparingDouble(Pair::getKey));
      
      //Use a priority queue to keep track of the highest quality of workers
      PriorityQueue<Integer> highestQualityWorkers = new PriorityQueue<>(Collections.reverseOrder());
      
      
      for(int i = 0 ;i < n;i++){
        highestQualityWorkers.add(wageToQualityRatio.get(i).getValue());
        currentTotalQuality+= wageToQualityRatio.get(i).getValue();
        
       if(highestQualityWorkers.size() > k)
        {
          currentTotalQuality -= highestQualityWorkers.poll();
        }
      
       if(highestQualityWorkers.size() == k)
        {
          totalCost = Math.min(totalCost, currentTotalQuality *         wageToQualityRatio.get(i).getKey());
        }
        
      }
      
     
return totalCost;
      
    }
}