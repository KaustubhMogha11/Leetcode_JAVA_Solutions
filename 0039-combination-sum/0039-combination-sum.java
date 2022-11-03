class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        
        ans(candidates,0,ans,ds,target);
        
        return ans;
    }
    
    public static void ans(int[] nums,int i,List<List<Integer>> ans,List<Integer> ds,int target)
    {
        if(i==nums.length){
        if(target==0)
        {
            ans.add(new ArrayList<>(ds));
        }
            return;
        }
        
        if(nums[i]<=target)
        {
        ds.add(nums[i]);
        ans(nums,i,ans,ds,target-nums[i]);
        ds.remove(ds.size()-1);
        }
        
        ans(nums,i+1,ans,ds,target);
    }
}