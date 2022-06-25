class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        Integer storage[][]=new Integer[triangle.size()][triangle.size()];
        
        return minimumTotal(triangle,0,0,storage);
   
    
        
    }
       public int minimumTotal(List<List<Integer>> triangle,int row, int col, Integer[][] storage)
       {
           if(row==triangle.size()-1)
            {
               return triangle.get(row).get(col);
           }
           
           if(storage[row][col]!=null)
           {
               return storage[row][col];
           }
           
           int opt1=minimumTotal(triangle,row+1,col,storage);
           int opt2=minimumTotal(triangle,row+1,col+1,storage);
           storage[row][col]=Math.min(opt1,opt2)+triangle.get(row).get(col);
           
           return storage[row][col];
           
           
           
       }
    
}