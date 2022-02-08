class Solution {
    public int numSquares(int n) {
        
//         int ans=Integer.MAX_VALUE;
//         if(n <= 3)return n;
        
//         for(int i = 1;i*i<=n;i++){
//             ans = Math.min(ans,1 + numSquares(n - (i*i)));
//         }
//         return ans;
        int storage[]=new int [n+1];
        
        return numSquaresM(n,storage);
        
    }
      public int numSquaresM(int n, int[] storage) {
          
       if(n==0)
       {
           return storage[n];
       }
          int ans=Integer.MAX_VALUE;
          // storage[0]=0;
          // storage[1]=1;
          // storage[2]=2;
          // storage[3]=3;
          
          if(storage[n]!=0)
          {
              return storage[n];
          }
          
         for(int i = 1;i*i<=n;i++){
             ans = Math.min(ans,1 + numSquaresM(n - (i*i),storage));
          }
           storage[n]=ans;
                           
          return storage[n];                 
          
      }
}