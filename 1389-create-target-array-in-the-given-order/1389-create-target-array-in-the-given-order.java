class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
        ArrayList <Integer> list=new ArrayList<>();
        int ans[]=new int[nums.length];
        
        for(int i=0; i<nums.length;i++)
        {
            list.add(index[i], nums[i]);
            
        }
        
        for(int j=0;j<list.size();j++){
            
            ans[j]=list.get(j);
        }
        
        return ans;
    }
}