class Solution {                                                            // https://youtu.be/C6cm6IvqmyA

    public void dfs(Map<String, List<Pair>> adj,
                    String src,
                    String dst,
                    Set<String> visited,
                    double product,
                    double[] ans){
        if(visited.contains(src))
            return;
        
        visited.add(src);

        if(src.equals(dst)){
            ans[0] = product;
            return; 
        }
        for(Pair p : adj.getOrDefault(src, new ArrayList<>())){
            dfs(adj, p.v, dst, visited, product * p.w, ans);
        }
    }

    static class Pair{
        String v;
        double w;
        Pair(String v, double w){
            this.v = v;
            this.w = w;
        }
    }

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, List<Pair>> adj = new HashMap<>();

        for(int i=0; i<equations.size(); i++){
            String u = equations.get(i).get(0);
            String v = equations.get(i).get(1);
            double val = values[i];

            adj.computeIfAbsent(u, k -> new ArrayList<>()).add(new Pair(v, val));
            adj.computeIfAbsent(v, k -> new ArrayList<>()).add(new Pair(u, 1.0/val));
        }

        double[] result = new double[queries.size()];

        for(int i=0;i<queries.size();i++){
            String src = queries.get(i).get(0);
            String dst = queries.get(i).get(1);

            double[] ans = new double[]{-1.0};

            if(adj.containsKey(src)){
                Set<String> visited = new HashSet<>();
                dfs(adj, src, dst, visited, 1.0, ans);
            }
            result[i] = ans[0];
        }
        return result;
    }
}