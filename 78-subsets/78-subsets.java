class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        
        ans(nums,0,ans,ds);
        
        return ans;
    }
    
    public static void ans(int[] nums,int i,List<List<Integer>> ans,List<Integer> ds)
    {
        if(i==nums.length)
        {
            ans.add(new ArrayList<>(ds));
            return;
                
            
        }
        
        ds.add(nums[i]);
        ans(nums,i+1,ans,ds);
        ds.remove(ds.size()-1);
       ans(nums,i+1,ans,ds);

    }
}