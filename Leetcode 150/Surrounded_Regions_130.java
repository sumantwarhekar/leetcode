class Solution {                                                                                    // https://youtu.be/BtdgAys4yMk
    public void dfs(int row, int col, boolean[][] vis, char[][] board, int[] drow, int[] dcol){
        vis[row][col] = true;
        int m = board.length;
        int n = board[0].length;

        for(int i=0;i<4;i++){
            int nrow = row + drow[i];
            int ncol = col + dcol[i];
            if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && !vis[nrow][ncol] && board[nrow][ncol]=='O'){
                dfs(nrow, ncol, vis, board, drow, dcol);
            }
        }
    }

    public void solve(char[][] board) {
        if(board==null || board.length==0 || board[0].length==0)
            return;
        
        int m = board.length;
        int n = board[0].length;

        boolean[][] vis = new boolean[m][n];
        int[] drow={-1, 0, 1, 0};
        int[] dcol={0, 1, 0, -1};

        for(int j=0;j<n;j++){
            if(!vis[0][j] && board[0][j]=='O')
                dfs(0, j, vis, board, drow, dcol);

            if(!vis[m-1][j] && board[m-1][j]=='O')
                dfs(m-1, j, vis, board, drow, dcol);
        }   

        for(int i=0;i<m;i++){
            if(!vis[i][0] && board[i][0]=='O')
                dfs(i, 0, vis, board, drow, dcol);

            if(!vis[i][n-1] && board[i][n-1]=='O')
                dfs(i, n-1, vis, board, drow, dcol);
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!vis[i][j] && board[i][j]=='O')
                    board[i][j] = 'X';
            }
        }

    }
}