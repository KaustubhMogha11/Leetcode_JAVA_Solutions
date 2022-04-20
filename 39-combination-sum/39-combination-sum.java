class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        
        sum(candidates,ans,ds,0,target);
        return ans;
    }
    
    public static void sum(int[] nums, List<List<Integer>> ans, List<Integer> ds, int index, int target)
    {
        if(index==nums.length)
        {
            if(target==0)
            {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        
        if(nums[index]<=target)
        {
            ds.add(nums[index]);
            sum(nums,ans,ds,index,target-nums[index]);
            ds.remove(ds.size()-1);
        }
        
        sum(nums,ans,ds,index+1,target);
    }
}
