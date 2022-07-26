class Solution {
    public void rotate(int[][] matrix) {
        
        for(int i=0;i<matrix[0].length;i++)
        {
            for(int j=i;j<matrix.length;j++)
            {
                int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        for(int i=0;i<matrix.length;i++)
        {
            int s=0;
            int e=matrix.length-1;
            int temp=0;
            while(s<e)
            {
             temp=matrix[i][s];
                matrix[i][s]=matrix[i][e];
                matrix[i][e]=temp;
                s++;
                e--;
            }
        }
        
       
    }
}