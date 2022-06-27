class Solution {
    public boolean isPowerOfTwo(int n) {
        
        if(n==1)
        {
            return true;
        }
        while(n>1)
        {
            if(n%2!=0)
            {
                return false;
            }
            
            n=n/2;
        }
        
        return n==1;
    }
}