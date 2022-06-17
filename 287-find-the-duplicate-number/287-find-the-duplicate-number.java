class Solution {
    public int findDuplicate(int[] nums) {
     
//         int count[]=new int[nums.length+1];
        
//         for(int i=0; i<nums.length;i++)
//         {
//             count[nums[i]]++;
//             if(count[nums[i]]>1)
//             {
//                 return nums[i];
//             }
//         }
        
//         return -1;
        
        for( int i=0;i<nums.length;)
        {
            int correct=nums[i]-1;
          if(nums[i]!=i+1)
            {
                if(nums[i]!=nums[correct])
                {
                   int temp=nums[correct];
                nums[correct]=nums[i];
                nums[i]=temp;
                }else
                {
                    return nums[i];
                }
            }else{
                i++;
            }
        }
    return -1;
    }
}