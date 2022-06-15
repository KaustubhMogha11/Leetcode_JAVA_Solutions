class Solution {
    public void rotate(int[] nums, int k) {
       
        int n=nums.length;
        k=k%n;
      
         rotateSubArray(nums,0,n-k);
         rotateSubArray(nums,n-k,n);
          rotateSubArray(nums,0,n);
        
        
        
        
    }
         public static void rotateSubArray(int[] nums , int start , int end)
    {
            int temp=0;
             while(start<end)
             {
                 temp=nums[start];
                 nums[start]=nums[end-1];
                 nums[end-1]=temp;
                 start++;
                 end--;
             }
             
    }
}