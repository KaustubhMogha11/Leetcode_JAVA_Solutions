class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        
      List<List<Integer>> ans=new ArrayList<>();
        
        permutations(nums,ans,0);
        return ans;
    }
   public static void permutations(int[] nums, List<List<Integer>> ans, int index)
          {
       if(index==nums.length)
       {
           ArrayList<Integer> ds=new ArrayList<Integer>();
           for(int i=0;i<nums.length;i++)
           {
               ds.add(nums[i]);
           }
           if(!ans.contains(new ArrayList<>(ds)))
           {
               ans.add(new ArrayList<>(ds));
           }
           return;
       }
              
       for(int i=index;i<nums.length;i++)
       {
           swap(i,index,nums);
           
                    permutations(nums,ans,index+1);
                      swap(i,index,nums);

       }
      }
      public static void swap(int i, int index, int[] nums)
      {
          int t=nums[i];
          nums[i]=nums[index];
          nums[index]=t;
        
              
      }
}
