class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map1 = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map1.put(nums[i],map1.getOrDefault(nums[i],0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map1.get(b) - map1.get(a));
        map1.keySet().forEach(a->pq.add(a)) ;
        int[] ans = new int[k];
        int i = 0;
        while (k-->0){
            ans[i++] = pq.poll();
        }
        return ans;
 
    }
}