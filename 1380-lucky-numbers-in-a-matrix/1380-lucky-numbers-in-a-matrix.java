class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int minrow[]= new int[matrix.length];
        int maxcolumn[]=new int[matrix[0].length];
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<matrix.length;i++)
        {
             int a=100000;
            for(int j=0;j<matrix[0].length;j++)
            {
            if(a>matrix[i][j])
            {
                a=matrix[i][j];
            }
        
        }
            minrow[i]=a;
            
        }
        
        for (int i = 0; i < matrix[0].length; i++) {
            int count = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (count < matrix[j][i]) {
                    count = matrix[j][i];
                }
            }
            maxcolumn[i] = count;
        }
        
        for(int i=0;i<minrow.length;i++)
        {
            for(int j=0;j<maxcolumn.length;j++)
            {
                if(minrow[i]==maxcolumn[j])
                {
                    list.add(minrow[i]);
                }
            }
        }
        return list;
    }
}