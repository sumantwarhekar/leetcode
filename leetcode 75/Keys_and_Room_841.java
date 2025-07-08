class Solution {
    boolean[] visited;

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        visited = new boolean[rooms.size()];
        visited[0] = true;
        dfs(rooms,0);
        for(int i=0;i<visited.length;i++){
            if(visited[i]==false)
                return false;
        }
        return true;
    }

    public void dfs(List<List<Integer>> rooms, int roomNumber){
        for(int i : rooms.get(roomNumber)){
            if(!visited[i]){
                visited[i]=true;
                dfs(rooms,i);
            }
        }
    }
}