class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        List<Integer> list=new ArrayList<>();
        int rs=0;
        int re=matrix.length-1;
        int cs=0;
        int ce=matrix[0].length-1;
        int count=0;
        int total=r*c;
     while(count<total) {
			
			for(int i=cs; count<total && i<=ce;i++) {
				list.add(matrix[rs][i]);
				count++;
			}
			rs++;
			for(int i=rs; count<total && i<=re;i++) {
				list.add(matrix[i][ce]);
				count++;
			}
			ce--;
			for(int i=ce;count<total && i>=cs;i--) {
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