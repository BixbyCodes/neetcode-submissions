class Solution {
    public boolean validTree(int n, int[][] edges) {
     if(edges.length!=n-1){
        return false;
     }
     List<List<Integer>> adj = new ArrayList<>();
     for(int i=0;i<n;i++){
        adj.add(new ArrayList<>());
     }
     for(int[] edge:edges){
        adj.get(edge[0]).add(edge[1]);
        adj.get(edge[1]).add(edge[0]);
     }
     Set<Integer> visited = new HashSet<>();
     dfs(0,adj,visited);
     return visited.size() == n;
    }
    public void dfs(int node ,List<List<Integer>> adj,Set<Integer> visited){
        if(visited.contains(node)){
            return ;
        }
        visited.add(node);
        for(int neighbor : adj.get(node)){
            dfs(neighbor,adj,visited);
        }
    }
}
