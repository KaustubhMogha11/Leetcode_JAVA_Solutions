class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
//         ArrayList <Integer> list=new ArrayList<>();
        int ans[]=new int[nums.length];
        
//         for(int i=0; i<nums.length;i++)
//         {
//             list.add(index[i], nums[i]);
            
//         }
        
//         for(int j=0;j<list.size();j++){
            
//             ans[j]=list.get(j);
//         }
        
//         return ans;
        for(int i=0; i<nums.length;i++){
            ans[i]=-1;
        }
        
        for(int i=0; i<nums.length;i++){
            if(nums[i]==-1){
                ans[index[i]]=nums[i];
            }else{
               // Shifting
                for (int j = index[i] + 1; j < nums.length; j++){
                    int temp = ans[j];
                    ans[j] = ans[index[i]];
                    ans[index[i]] = temp;
                }
                ans[index[i]] = nums[i];
            }
        }
        return ans;
    }
}