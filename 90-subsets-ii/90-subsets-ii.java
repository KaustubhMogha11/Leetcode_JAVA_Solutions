class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> ds=new ArrayList<>();
        
        subsets(nums,0,ds,ans);
        return ans;
    }
     public void subsets(int[] nums,int i,ArrayList<Integer> ds,  List<List<Integer>> ans){
       ans.add(new ArrayList<>(ds));  
       for(int index=i;index<nums.length;index++)
       {
           if(index!=i && nums[index]==nums[index-1]) continue;
         ds.add(nums[index]);
         subsets(nums,index+1,ds,ans);
         ds.remove(ds.size()-1);
       } 
     }
}