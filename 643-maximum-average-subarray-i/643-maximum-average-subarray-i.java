class Solution {
    public double findMaxAverage(int[] nums, int k) {
//         int i=0;
//         int j=0;
//         double avgsum=0;
//         double max=0;
//         if(nums.length==1)
//         {
//             return nums[0];
//         }
//         while(j<nums.length)
//         {
//             avgsum=avgsum+nums[j];
            
//             if(j-i+1<k)
//             {
//                 j++;
//             }else if(j-i+1==k)
//             {
                
//                 max=Math.max(max,avgsum);
//                 avgsum=avgsum-nums[i];
//                 i++;
//                 j++;
//             }
//         }
        
//         return max/k;
          double max=0,sum=0;
        for(int i=0;i<k;++i)
            sum+=nums[i];              // sum of first k elements of array
        max=sum/k;
        for(int i=k;i<nums.length;++i)
        {
            sum=sum+nums[i]-nums[i-k];            // main  trick is here , we add next index element (nums[i]) and substract element at bigging with the help of nums[i-k];
            if(max<(sum/k))
                max=(sum/k);        // store maximum Average subarray in max variable
        }
        return max;
    }
}
    
