class Solution {
    public int waysToSplitArray(int[] nums) {
        
//         int count=0;
//         int sum=0;
//         for(int i=0;i<nums.length-1;i++)
//         {
//             sum=sum+nums[i];
//             int lsum=0;
//             for(int j=i+1;j<nums.length;j++)
//             {
              
//                 lsum=lsum+nums[j];
//             }
            
//             if(sum>=lsum)
//             {
//                 count++;
//             }
//         }
       long sum = 0;
        for(int i : nums){
            sum+=i;
        }
        int sol = 0;
        long localSum = 0;
        for(int i=0; i<nums.length-1;i++){
            localSum += nums[i];
            if(localSum >= sum-localSum){
                sol++;
            }
        }
        return sol;
    }
}