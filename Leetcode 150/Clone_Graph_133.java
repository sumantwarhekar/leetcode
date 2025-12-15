class Solution {                                                // https://youtu.be/z7mPg_xT5xk
    private Map<Node, Node> map = new HashMap<>();
    
    private void dfs(Node node, Node cloneNode){
        for(Node neighbor : node.neighbors){
            if(!map.containsKey(neighbor)){
                Node clone = new Node(neighbor.val);
                map.put(neighbor, clone);
                cloneNode.neighbors.add(clone);
                dfs(neighbor, clone);
            }
            else{
                cloneNode.neighbors.add(map.get(neighbor));
            }
        }
    }

    public Node cloneGraph(Node node) {
        if(node == null)
            return null;

        map.clear();

        Node cloneNode = new Node(node.val);
        map.put(node, cloneNode);
        dfs(node, cloneNode);

        return cloneNode;
    }
}