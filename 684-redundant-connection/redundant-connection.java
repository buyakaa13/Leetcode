class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        DSU dsu = new DSU(edges.length);
        for(int i=0; i<edges.length; i++){
            if(!dsu.union(edges[i][0]-1, edges[i][1]-1))
                return edges[i];
        }
        return new int[]{};
    }

}

class DSU{
    int[] parent;
    int[] rank;
    public DSU(int n){
        parent = new int[n];
        rank = new int[n];
        for(int i=0; i<n; i++)
            parent[i] = i;
    }

    public int find(int i){
        int root = parent[i];
        if(parent[root] != root)
            return parent[i] = find(root);
        return root;
    }

    public boolean union(int x, int y){
        int xRoot = find(x);
        int yRoot = find(y);
        if(xRoot == yRoot) return false;
        if(rank[xRoot] < rank[yRoot])
            parent[yRoot] = xRoot;
        else if(rank[xRoot] > rank[yRoot]){
            parent[xRoot] = yRoot;
        }
        else{
            parent[yRoot] = xRoot;
            rank[xRoot] = rank[xRoot]+1;
        }
        return true;
    }
}