class Solution {
    int count=0;
    public int totalNQueens(int n) {
  char board[][]=new char[n][n];

    placeQueen(board,0,n);
return count;
	}
    
    public  void placeQueen(char[][] board,int row,int n){
     
        if(row==n)
        {
//             for(int i=0;i<n;i++)
//             {
//                 for(int j=0;j<n;j++)
//                 {
//                     System.out.print(board[i][j]+" ");

//                 }
                

//             }
//             System.out.println();
            // saveboard(board,chess);
            count++;
            return;
        }
        for(int j=0; j<n;j++)
        {
        if(isBoardSafe(board,row,j))
        {
            board[row][j]='Q';
              placeQueen(board,row+1,n);
              board[row][j]='.';
        }
        
        
            }
    }
    
    public  boolean isBoardSafe(char[][] board,int row,int col){
        int n=board.length;
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--)
        {
            if(board[i][j]=='Q')
            {
                return false;
        }
        }
        
        for(int i=row+1, j=col+1; i<n && j<n; i++, j++)
        {
            if(board[i][j]=='Q')
            {
                return false;
        }
        }
           for(int i=row-1, j=col+1; i>=0 && j<n; i--, j++)
        {
            if(board[i][j]=='Q')
            {
                return false;
        }
           }
         for(int i=row+1, j=col-1; i<n && j>=0; i++, j--)
        {
            if(board[i][j]=='Q')
            {
                return false;
        }
         }
        for(int i=row-1;i>=0;i--)
        {
            if(board[i][col]=='Q')
                return false;
        }
        
         for(int i=row+1;i<n;i++)
        {
            if(board[i][col]=='Q')
                return false;
        }
        
        return true;
    }
  
}
    
	

