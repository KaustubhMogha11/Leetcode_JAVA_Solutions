class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
      
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        Arrays.sort(nums);
        ans(nums,0,ans,ds);
        return ans;
    }
    
    public static void ans(int[] nums,int index,List<List<Integer>> ans,List<Integer> ds)
    {
      
           ans.add(new ArrayList<>(ds));
          
        
        for(int i=index;i<nums.length;i++)
        {
            if(i!=index && nums[i]==nums[i-1]) continue;
            
            
            ds.add(nums[i]);
            ans(nums,i+1,ans,ds);
            ds.remove(ds.size()-1);
          
            
        }
        
        
    }
}

    
