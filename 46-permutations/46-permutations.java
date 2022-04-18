class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        
        List<List<Integer>> ans=new ArrayList<>();
        // List<Integer> ds=new ArrayList<>();
        // boolean freq[]=new boolean[nums.length];
        
        permutations(nums,ans,0);
        
        return ans;
    }
      // public void permutations(int[] nums,List<Integer> ds, List<List<Integer>> ans, boolean[] freq){
      //     if(ds.size()==nums.length){
      //         ans.add(new ArrayList<>(ds));
      //         return;
      //     }
      //     for(int i=0; i<nums.length;i++)
      //     {
      //         if(!freq[i])
      //         {
      //             freq[i]=true;
      //             ds.add(nums[i]);
      //              permutations(nums,ds,ans,freq);
      //             ds.remove(ds.size()-1);
      //             freq[i]=false;
      //         }
      //     }
    
          public static void permutations(int[] nums, List<List<Integer>> ans, int index)
          {
              if(index==nums.length)
              {
                   List<Integer> ds=new ArrayList<>();
                  for(int i=0; i<nums.length;i++)
                  {
                      ds.add(nums[i]);
                  }
                  ans.add(new ArrayList<>(ds));
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