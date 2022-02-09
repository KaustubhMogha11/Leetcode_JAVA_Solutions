class Solution {
    
     public int climbStairs(int n){
         
         int storage[]=new int[n+1];
         return  climbStairsM(n,storage);
     }
    
    
    public int climbStairsM(int n, int[] storage) {
    
        if(n<0)
        {
            return 0;
        }
        
        if(n==0)
        {
            storage[n]=1;
        return storage[n];
        }
        
        if(storage[n]!=0)
        {
            return storage[n];
        }
        storage[n]=climbStairsM(n-1, storage)+climbStairsM(n-2, storage);
        
        return storage[n];
    }
    
}