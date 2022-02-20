class Solution {
    public int uniquePaths(int m, int n) {
        int storage[][]=new int[m+1][n+1];
     
        
        for(int i=1; i<=m;i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(i==1 || j==1)
                {
                    storage[i][j]=1;
                } else
                {
                
                storage[i][j]= storage[i-1][j]+storage[i][j-1];
            }
        }
        }      
        
        return storage[m][n];
            // return uniquePathsm(m,n,0,0,storage);
            
    }
//      public int uniquePathsm(int m, int n, int i, int j, int [][]storage){
         
//          if(i==m-1 && j==n-1)
//          {
//              // storage[m-1][n-1]=1;
             
//              return 1;
//          }
         
//           if(i>=m || j>=n  ){
//              return Integer.MAX_VALUE;
//          }
         
//           if(storage[i][j]!=0)
//          {
//              return storage[i][j];
//          }
         
//         int count=0;
         
//          if(i+1<=m-1)
//          {
//            count+=uniquePathsm(m,n,i+1,j, storage);
//          }
//          if(j+1<=n-1)
//          {
//             count+= uniquePathsm(m,n,i,j+1, storage);
//          }
//          storage[i][j]=count;
//          return storage[i][j];
//      }
}