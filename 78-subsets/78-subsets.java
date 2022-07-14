class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> ds=new ArrayList<>();
        
        subset(nums,ans,ds,0);
        return ans;
    }
    
    public void subset(int[] nums,List<List<Integer>> ans,ArrayList<Integer> ds,int i){
        if(i==nums.length)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[i]);
        subset(nums,ans,ds,i+1);
        ds.remove(ds.size()-1);
         subset(nums,ans,ds,i+1);
    }
}