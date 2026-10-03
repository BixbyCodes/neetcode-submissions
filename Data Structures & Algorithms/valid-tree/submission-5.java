class Solution {
    public boolean validTree(int n, int[][] edges) {
        // Base condition
        if (edges.length != n - 1) {
            return false;
        }

        // Initialize parent array where each node is its own parent initially
        int[] parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        // Process each edge
        for (int[] edge : edges) {
            int root1 = find(parent, edge[0]);
            int root2 = find(parent, edge[1]);

            // If both nodes have the same root, they are already connected -> Cycle!
            if (root1 == root2) {
                return false;
            }

            // Union the two sets by making one root point to the other
            parent[root1] = root2;
        }

        // If we processed all edges without finding a cycle, it's a tree
        return true;
    }

    // Helper method to find the root of a node (with path compression)
    private int find(int[] parent, int node) {
        if (parent[node] == node) {
            return node;
        }
        // Path compression: point the node directly to the ultimate root
        return parent[node] = find(parent, parent[node]);
    }
}