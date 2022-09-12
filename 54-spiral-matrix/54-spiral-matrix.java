class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int row=matrix.length;
        int col=matrix[0].length;
        
        int rs=0;
        int cs=0;
        int re=row-1;
        int ce=col-1;
        int count=0;
        int total=row*col;
        List<Integer> list=new ArrayList<>();
        while(count<row*col){
            
            for(int i=rs;count<total &&i<=ce;i++)
            {
                list.add(matrix[rs][i]);
                count++;
            }
            rs++;
            
            for(int i=rs;count<total&& i<=re;i++)
            {
                list.add(matrix[i][ce]);
                count++;
            }
            
            ce--;
            
            for(int i=ce;count<total&& i>=cs;i--)
            {
                list.add(matrix[re][i]);
                count++;
            }
            re--;
       for(int i=re;count<total && i>=rs;i--) {
				list.add(matrix[i][cs]);
				count++;
			}
			cs++;
	}
        return list;
    }
}