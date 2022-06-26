class Solution {
    public int maxScore(int[] cardPoints, int k) {
       
        int sum=0;
        int window=0;
        int ans=0;
        int n=cardPoints.length;
        for(int i=0;i<n;i++)
        {
            sum+=cardPoints[i];
        }
         if(n==k)
        {
            return sum;
        }
        
     for(int i=0;i<n-k-1;i++)
     {
         window+=cardPoints[i];
     }
        
     for(int i=n-k-1;i<n;i++)
     {
         window+=cardPoints[i];
         ans=Math.max(ans,sum-window);
         window-=cardPoints[i-(n-k-1)];
     }
        
        return ans;
    }
}