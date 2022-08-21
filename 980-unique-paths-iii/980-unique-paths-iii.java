class Solution {
    int empty=1;int res=0;
    public int uniquePathsIII(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
      int sx=0;
        int sy=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==0)
                    empty++;
                else if(grid[i][j] == 1){ 
                    sx = i;
                    sy = j;
            }
            }
        }
        
        ans(sx,sy,m,n,grid);
     return res;   
    }
        
        public  void ans(int i,int j,int m,int n , int[][] grid)
        {
           if(i<0 || i>=m || j<0 || j>=n || grid[i][j] < 0)
            return;
        if(grid[i][j] == 2){
            if(empty == 0)
                res++;
            return;
        }
        empty--;
           
        grid[i][j] = -2;
        ans(i+1, j, m, n,grid);
       ans(i-1, j, m, n,grid);
            ans(i, j+1, m, n,grid);
            ans(i, j-1, m, n,grid);
        grid[i][j] = 0;
        empty++;
        }
    
}