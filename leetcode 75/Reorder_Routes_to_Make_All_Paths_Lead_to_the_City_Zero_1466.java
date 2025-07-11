class Solution {
    int count =0;
    
    public int minReorder(int n, int[][] connections) {
        Map<Integer, List<List<Integer>>> adj = new HashMap<>();

        for(int[] connection : connections){
            adj.computeIfAbsent(connection[0],k -> new ArrayList<List<Integer>>())
            .add(Arrays.asList(connection[1],1));

            adj.computeIfAbsent(connection[1],k -> new ArrayList<List<Integer>>())
            .add(Arrays.asList(connection[0],0));
        }
        dfs(0,-1,adj);
        return count;
    }

    public void dfs(int node, int parent, Map<Integer, List<List<Integer>>> adj){
        if(!adj.containsKey(node))
            return;
        
        for(List<Integer> nei : adj.get(node)){
            int neighbor = nei.get(0);
            int sign = nei.get(1);
            if(neighbor!=parent){
                count+=sign;
                dfs(neighbor,node,adj);
            }
        }
    }
}