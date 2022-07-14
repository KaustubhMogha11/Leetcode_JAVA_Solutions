class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
     
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> ds=new ArrayList<>();
        Arrays.sort(candidates);
        Sum(candidates,ans,ds,0,target);
        return ans;
    }
    
    public void Sum(int[] nums,List<List<Integer>> ans,ArrayList<Integer> ds,int index,int target){
        
        if(target==0)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i=index;i<nums.length;i++)
        {
            if(i>index && nums[i]==nums[i-1]) continue;
            
            if(nums[i]>target)
            {
                break;
            }
            ds.add(nums[i]);
            Sum(nums,ans,ds,i+1,target-nums[i]);
            ds.remove(ds.size()-1);
        }
    }
}