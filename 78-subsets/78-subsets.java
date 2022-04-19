class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        subset(0,nums,ans,ds);
        
        return ans;
    }
    
    public static void subset(int index, int[] nums, List<List<Integer>> ans,List<Integer> ds)
    {
        
        if(index==nums.length)
        {
             ans.add(new ArrayList<>(ds));   
            return;
        }
        
        ds.add(nums[index]);
         subset(index+1,nums,ans,ds);
        ds.remove(ds.size()-1);
         subset(index+1,nums,ans,ds);
    }
}