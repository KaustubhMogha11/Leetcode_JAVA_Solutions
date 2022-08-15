class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        
        int max=0;
        int ans=-1;
        for(int i=0;i<values.length;i++)
        {
            ans=Math.max(ans,values[i]-i+max);
            max=Math.max(max,values[i]+i);
        }
        
        return ans;
    }
}