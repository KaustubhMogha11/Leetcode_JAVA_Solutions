class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> ds=new ArrayList<>();
        boolean freq[]=new boolean[nums.length];
        
        permute(nums,ans,ds,freq);
        return ans;
    }
    
    public void permute(int[] nums,List<List<Integer>> ans,ArrayList<Integer> ds,boolean[] freq){
        if(ds.size()==nums.length)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i=0;i<nums.length;i++)
        {
            if(!freq[i]){
            freq[i]=true;
            ds.add(nums[i]);
            permute(nums,ans,ds,freq);
            freq[i]=false;
            ds.remove(ds.size()-1);
            }
        }
    }
}