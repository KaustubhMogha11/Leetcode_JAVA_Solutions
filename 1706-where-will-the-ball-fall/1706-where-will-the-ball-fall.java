class Solution {
    public int[] findBall(int[][] grid) {
        
      int m=grid[0].length;
      int n=grid.length;
    
    int result[]=new int[m];
        
        for(int i=0;i<m;i++)
        {
            result[i]=ans(grid,0,i);
        }
        
        return result;
    }
    
    public int ans(int grid[][],int r,int c)
    {
        while(r!=grid.length)
        {
            int curr=grid[r][c];
            if(curr==1)
                c++;
            else c--;
            
            if(c<0 || c==grid[0].length || grid[r][c]==-1*curr)
                return -1;
            
            r++;
        }
        
        return c;
    }
}