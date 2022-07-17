class Solution {
    public int[] numberOfPairs(int[] nums) {
     
        int count1=0;
        int count2=0;
        
        int freq[]=new int[101];
        for(int i=0;i<nums.length;i++)
        {
            freq[nums[i]]++;
        }
        for(int i=0;i<freq.length;i++)
        {
           count1+=freq[i]/2;
            count2+=freq[i]%2;
        }
    return new int[]{count1,count2};
    }
}