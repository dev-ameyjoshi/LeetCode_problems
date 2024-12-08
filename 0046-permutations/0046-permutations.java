class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public void swap(int [] nums, int i , int j){
      int temp = nums[i];
      nums[i] = nums[j];
      nums[j] = temp;
    }

    public void solve(int [] nums,int index){
      //base case
      if(index == nums.length){
        List<Integer> perm = new ArrayList<>();
        for(int num : nums) perm.add(num);
        res.add(perm);
        return;
      }
      
      for(int i = index;i < nums.length;i++){
        swap(nums,index,i);
        solve(nums,index + 1);
        swap(nums,index,i);
      }
    }

    public List<List<Integer>> permute(int[] nums) {
        solve(nums,0);
        return res;
    }
    
}