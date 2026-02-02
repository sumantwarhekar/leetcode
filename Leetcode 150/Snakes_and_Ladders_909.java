class Solution {
    int n;

    private int[] getCoord(int s){
        int row = n-1-(s-1)/n;
        int col = (s-1)%n;

        if( (n%2==1 && row%2==1) || (n%2==0 && row%2==0) ){
            col = n-1-col;
        }

        return new int[]{row,col};
    }

    public int snakesAndLadders(int[][] board) {
        n = board.length;
        boolean[][] visited = new boolean[n][n];
        Queue<Integer> q = new LinkedList<>();

        q.offer(1);
        visited[n-1][0]=true;

        int steps=0;

        while(!q.isEmpty()){
            int size = q.size();

            while(size-->0){
                int curr = q.poll();

                if(curr==n*n)
                    return steps;

                for(int dice=1;dice<=6;dice++){
                    int next = curr + dice;
                    if(next > n*n)
                        break;

                    int[] coord = getCoord(next);
                    int r = coord[0], c=coord[1];

                    if(visited[r][c])
                        continue;

                    visited[r][c] = true;

                    if(board[r][c]==-1){
                        q.offer(next);
                    }else{
                        q.offer(board[r][c]);
                    }
                }
            }
            steps++;
        }
        return -1;
    }
}