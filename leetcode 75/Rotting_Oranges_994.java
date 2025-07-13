class Pair{
    int row;
    int col;
    int time;
    Pair(int row, int col, int time){
        this.row = row;
        this.col = col;
        this.time = time;
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        Queue<Pair> queue = new LinkedList<>();

        int[][] visited = new int[n][m];
        int freshCount = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 2){
                    queue.add(new Pair(i,j,0));
                    visited[i][j] = 2;
                }
                else{
                    visited[i][j] = 0;
                }
                if(grid[i][j] == 1){
                    freshCount++;
                }
            }
        }

        int time = 0;
        int drow[] = {-1,0,1,0};
        int dcol[] = {0,1,0,-1};
        int count = 0;

        while(!queue.isEmpty()){
            int r = queue.peek().row;
            int c = queue.peek().col;
            int t = queue.peek().time;
            time = Math.max(time, t);
            queue.remove();
            for(int i=0;i<4;i++){
                int nrow = r + drow[i];
                int ncol = c + dcol[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && visited[nrow][ncol]==0 && grid[nrow][ncol]==1){
                    queue.add(new Pair(nrow,ncol,t+1));
                    visited[nrow][ncol] = 2;
                    count++;
                }
            }
        }

        if(count != freshCount)
            return -1;
        return time;
    }
}