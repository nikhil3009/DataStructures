package Blind75;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m  = board[0].length;
        boolean[][] visited = new boolean[n][m];
        boolean result = false;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j] == word.charAt(0)){
                    result = backtrack(board,word,visited,i,j,0,n,m);
                }
                if(result == true){
                    return true;
                }

            }
        }

        return false;
    }

    private boolean backtrack(char[][] board, String word,boolean[][] visited, int row, int col, int index,int n, int m){
        if(index == word.length()){
            return true;
        }

        if (row < 0 || row >= n|| col < 0 || col >= m || visited[row][col] || board[row][col] != word.charAt(index)) {
            return false;
        }
        visited[row][col] = true;
        if(backtrack(board,word,visited,row+1,col,index+1,n,m) || backtrack(board,word,visited,row-1,col,index+1,n,m) || backtrack(board,word,visited,row,col+1,index+1,n,m) ||backtrack(board,word,visited,row,col-1,index+1,n,m)){
            return true;
        }
        visited[row][col] = false;
        return false;
    }
}
