class Solution {
    public static boolean findRotation(int[][] mat, int[][] target) {
        for (int j = 0; j < 4; j++){
            mat = rotate(mat);
            if (isEqual(mat, target)) {
                return true;
            }
        }
        return false;
    }
    public static boolean isEqual(int[][] mat, int[][] target){
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static int[][] rotate(int[][] mat){
        mat = transpose(mat);
        int temp, n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n/2; j++) {
                temp = mat[i][j];
                mat[i][j] = mat[i][n-j-1];
                mat[i][n-j-1] = temp;
            }
        }
        return mat;
    }
    public static int[][] transpose(int[][] matrix) {
        int[][] res = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                res[i][j] = matrix[j][i];
            }
        }
        return res;
    }
}