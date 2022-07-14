class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
     
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> ds=new ArrayList<>();
        Arrays.sort(nums);
        subset(nums,ans,ds,0);
        return ans;
    }
    
    public void subset(int[] nums,List<List<Integer>> ans,ArrayList<Integer> ds,int index)
    {
       ans.add(new ArrayList<>(ds));
         
       
        
        for(int i=index;i<nums.length;i++)
        {
            if(i!=index && nums[i]==nums[i-1]) continue;
                
            ds.add(nums[i]);
            subset(nums,ans,ds,i+1);
            ds.remove(ds.size()-1);
            
        }
        
        
    }
}