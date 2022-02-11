class Solution {
    public int minPathSum(int[][] grid) {
       
        // return minPathSumb(grid,0,0);
         int m=grid.length;
         int n=grid[0].length;
        int storage[][]=new int[m][n];
        return minPathSumb(grid,0,0,storage);
    }
     public int minPathSumb(int[][] grid, int i,int j, int [][] storage){
         
         int m=grid.length;
         int n=grid[0].length;
         
//          if(i==m-1 && j==n-1){
//              return grid[i][j];
//          }
         
//          if(i>=m || j>=n  ){
//              return Integer.MAX_VALUE;
//          }
         
//          int option1=minPathSumb(grid,i,j+1);
//           // int option2=minPathSumb(grid,i+1,j+1);
//           int option3=minPathSumb(grid,i+1,j);
     
//       return grid[i][j]+Math.min(option1, option3);
     
     
         if(i==m-1 && j==n-1){
             storage[m-1][n-1]=grid[i][j];
             return storage[i][j];
         }
         
         if(i>=m || j>=n  ){
             return Integer.MAX_VALUE;
         }
         
         if(storage[i][j]!=0)
         {
             return storage[i][j];
         }
         
          int option1=minPathSumb(grid,i,j+1,storage);
//           // int option2=minPathSumb(grid,i+1,j+1);
          int option3=minPathSumb(grid,i+1,j,storage);
         storage[i][j]=grid[i][j]+Math.min(option1,option3);
         
         return storage[i][j];
     }
         
}