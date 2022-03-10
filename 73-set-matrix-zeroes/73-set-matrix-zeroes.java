class Solution {
    public void setZeroes(int[][] matrix) {
        
        int r=matrix.length;
        int c=matrix[0].length;
        
        ArrayList<Integer> row=new ArrayList<>();
         ArrayList<Integer> col=new ArrayList<>();
        
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(matrix[i][j]==0){
                    // Add column no. to the list if not present already
                    if(!col.contains(j)){
                        col.add(j);
                    }
                    // Add row no. to the list if not present already
                    if(!row.contains(i)){
                        row.add(i);
                    }
                }
            }
        }
        
        for(int i=0;i<row.size();i++)
        {
            for(int j=0;j<c;j++)
            {
                matrix[row.get(i)][j]=0;
            }
        }
        
         for(int i=0;i<r;i++)
        {
            for(int j=0;j<col.size();j++)
            {
                matrix[i][col.get(j)]=0;
            }
        }
        
    }  
}