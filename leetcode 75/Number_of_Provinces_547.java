class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int provinces = 0;
        boolean[] visited = new boolean[n];

        for(int i=0;i<n;i++){
            if(visited[i]==false){
                provinces++;
                dfs(i,isConnected,visited);
            }
        }
        return provinces;
    }

    public void dfs(int node, int[][] isConnected, boolean[] visited){
        visited[node] = true;
        for(int i=0;i<isConnected.length;i++){
            if(isConnected[node][i] == 1 && !visited[i]){
                dfs(i, isConnected, visited);
            }
        } 
    }
}