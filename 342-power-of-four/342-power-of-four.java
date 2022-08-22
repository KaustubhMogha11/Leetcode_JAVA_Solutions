class Solution {
    public boolean isPowerOfFour(int n) {
        
        while(n>1)
        {
            if(n%4==0)
            n=n/4;
            else return false;
        }
        
        return n==1?true:false;
    }
}