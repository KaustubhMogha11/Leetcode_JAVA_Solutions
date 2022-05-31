class Solution {
    public boolean isUgly(int n) {
     
        for(int i=2;i<6 && n!=0;i++)
        {
            while(n%i==0)
            {
                n=n/i;
            }
        }
        
        return n==1;
    }
}