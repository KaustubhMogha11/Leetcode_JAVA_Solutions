class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        Arrays.sort(candidates);
        ans(candidates,0,ans,ds,target);
        return ans;
    }
    
    public static void ans(int[] nums,int index,List<List<Integer>> ans,List<Integer> ds,int target)
    {
         if(target==0)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i=index;i<nums.length;i++)
        {
            if(i>index && nums[i]==nums[i-1]) continue;
            
            if(nums[i]>target)
                break;
            
            ds.add(nums[i]);
            
            ans(nums,i+1,ans,ds,target-nums[i]);
                
            ds.remove(ds.size()-1);
        }
    }
}