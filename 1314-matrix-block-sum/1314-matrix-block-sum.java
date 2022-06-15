class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        
    int n = mat.length, m = mat[0].length, r1, c1, r2, c2;
        int[][] preSum = new int[n+1][m+1];
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=m; j++) {
                preSum[i][j] = preSum[i-1][j] + preSum[i][j-1] + mat[i-1][j-1] - preSum[i-1][j-1];
            }
        }
        
        int[][] result = new int[n][m];
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                r1 = Math.max(i-k, 0);
                c1 = Math.max(j-k, 0);
                r2 = Math.min(i+k, n-1);
                c2 = Math.min(j+k, m-1);
                result[i][j] = preSum[r2+1][c2+1] - preSum[r1][c2+1] - preSum[r2+1][c1] + preSum[r1][c1]; 
            }
        }
        return result;
    }
}