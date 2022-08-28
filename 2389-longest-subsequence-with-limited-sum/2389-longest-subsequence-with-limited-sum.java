class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
       Arrays.sort(nums);
        int n=queries.length;
        int arr[]=new int[n];
        int k=0;
        int count=0;
        for(int i=0;i<n;i++)
        {
           int sum=0;
            // int count=0;
            for(int j=0;j<nums.length;j++)
            {
                sum+=nums[j];
                if(sum<=queries[i])
                {
                    arr[i]++;
                }
            }
        }
        return arr;
    }
}