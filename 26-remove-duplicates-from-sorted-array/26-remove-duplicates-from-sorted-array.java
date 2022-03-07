class Solution {
    public int removeDuplicates(int[] nums) {
        
//        if(nums.length==0 || nums.length==1)
//            return nums.length;
//         int index=1;
//         for(int i=0; i<nums.length-1; i++){
//            //if elements are not duplicate
//         if(nums[i]!=nums[i+1])
//             nums[index++]=nums[i+1];
    
    
//         }
//         return index;
        if(nums.length==0 || nums.length==1)
        {
            return nums.length;
        }
        int index=1;
        for(int i=0; i<nums.length-1;i++)
        {
            if(nums[i]!=nums[i+1])
            {
                nums[index++]=nums[i+1];
            }
            
        }
        
        return index;
    }
}