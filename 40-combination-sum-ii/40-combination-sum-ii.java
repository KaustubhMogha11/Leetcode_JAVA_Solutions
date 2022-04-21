class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
     List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
         Arrays.sort(candidates);
        sum(candidates,ans,ds,0,target);
        return ans;
    }
    
    public static void sum(int[] nums, List<List<Integer>> ans, List<Integer> ds, int index, int target)
    {
       
        if(target==0)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        
    for(int i=index;i<nums.length;i++)
    {
        if(i>index && nums[i]==nums[i-1])
            continue;
        if(nums[i]>target)
            break;
        
        // ds.add(arr[i]);
        // combinationsUnique(i+1,arr,target-arr[i],ans,ds);
        // ds.remove(ds.size()-1);
            ds.add(nums[i]);
            sum(nums,ans,ds,i+1,target-nums[i]);
            ds.remove(ds.size()-1);
        
        }
    
    }
}
