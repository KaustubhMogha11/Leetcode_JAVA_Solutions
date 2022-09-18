class Solution {
    public int smallestEvenMultiple(int n) {
        
        if(n==0)
            return 0;
        
        for(int i=n;i<=2*n;i++)
        {
            if(i%n==0 && i%2==0)
                return i;
        }
        
        return -1;
    }
}