class Solution {
    public List<List<String>> solveNQueens(int n) {
 char board[][]=new char[n][n];
    List<List<String>> chess= new ArrayList<>();
    placeQueen(board,0,n,chess);
return chess;
	}
    
    public  void placeQueen(char[][] board,int row,int n, List<List<String>> chess){
     
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
            saveboard(board,chess);
            return;
        }
        for(int j=0; j<n;j++)
        {
        if(isBoardSafe(board,row,j))
        {
            board[row][j]='Q';
              placeQueen(board,row+1,n,chess);
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
    public void saveboard(char[][] board , List<List<String>> chess){
    String row = "";
    List<String> newBoard = new ArrayList<>();
    
    for(int i = 0; i< board.length ; i++){
        row = "";
        for(int j = 0 ; j<board[0].length ; j++){
            if(board[i][j] == 'Q'){
                row += 'Q';
            }
            else
                row += '.';
        }
        newBoard.add(row);
    }
    chess.add(newBoard);
}
    
	
}
