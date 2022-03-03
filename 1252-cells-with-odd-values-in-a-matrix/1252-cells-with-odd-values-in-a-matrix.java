class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        
        int ans[][]=new int[m][n];
        int index;
        for(int i=0; i<indices.length;i++){
            index=indices[i][0];
            for(int j=0;j<n;j++){
                ans[index][j]++;
            }
            
            index=indices[i][1];
               for(int k=0;k<m;k++){
                ans[k][index]++;
            }
            
        }
         int count = 0;
        for (int i = 0;i < m;i++){
            for (int j = 0;j < n;j++){
                if(ans[i][j] % 2 == 1)
                    count++;
            }
        }
        return count;
    }
}