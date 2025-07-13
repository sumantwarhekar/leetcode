class Solution {                                                   // https://www.youtube.com/watch?v=4EUpwKDqH28
    class Neighbor{
        String v;
        double w;
        Neighbor(String v, double w){
            this.v = v;
            this.w = w;
        }
    }
    
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        
        Map<String, List<Neighbor>> adj = new HashMap<>();

        for(int i=0;i<equations.size();i++){
            List<String> edge = equations.get(i);
            List<Neighbor> nbrs = adj.getOrDefault(edge.get(0), new ArrayList<>());
            nbrs.add(new Neighbor(edge.get(1),values[i]));
            adj.put(edge.get(0),nbrs);

            nbrs = adj.getOrDefault(edge.get(1), new ArrayList<>());
            nbrs.add(new Neighbor(edge.get(0), 1/values[i]));
            adj.put(edge.get(1),nbrs);
        }

        double[] ans = new double[queries.size()];
        for(int i=0;i<queries.size();i++){
            List<String> q = queries.get(i);
            if(adj.containsKey(q.get(0)) && adj.containsKey(q.get(1))){
                ans[i] = solve(q.get(0),1.0, new HashSet<>(), q.get(1), adj);
            }
            else{
                ans[i] = -1.0;
            }
        }
        return ans;
    }
    private double solve(String node, double ans, Set<String> vis, String target, Map<String, List<Neighbor>> adj){
        if(vis.contains(node))
            return -1.0;
        if(node.equals(target))
            return ans;
        vis.add(node);
        for(Neighbor nbr : adj.getOrDefault(node, new ArrayList<>())){
            double val = solve(nbr.v, ans*nbr.w, vis, target,adj);
            if(val != -1)
                return val;
        }
        return -1.0;
    }
}