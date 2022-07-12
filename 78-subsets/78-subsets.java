class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> ans =new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        
        subsets(nums,0,ds,ans);
        return ans;
    }
     public void subsets(int[] nums,int i,List<Integer> ds,List<List<Integer>> ans){
         
         if(i==nums.length)
         {
             ans.add(new ArrayList<>(ds));
             return;
         }
         
         ds.add(nums[i]);
          subsets(nums,i+1,ds,ans);
         ds.remove(ds.size()-1);
          subsets(nums,i+1,ds,ans);
     }
}