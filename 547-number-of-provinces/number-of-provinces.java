class Solution {
    public int findCircleNum(int[][] isConnected) {
        DSU dsu = new DSU(isConnected.length);
        int count = isConnected.length;
        for(int i=0; i<isConnected.length; i++){
            for(int j=i+1; j<isConnected[0].length; j++){
                if(isConnected[i][j] == 1 && dsu.find(i) != dsu.find(j)){
                    count--;
                    dsu.union(i, j);
                }
            }
        }
        return count;
    }
}

class DSU{
    private int[] parent; 
    private int[] rank;
    public DSU(int n){
        parent = new int[n];
        rank = new int[n];
        for(int i=0; i<n; i++)
            parent[i] = i;
    }

    public int find(int i){
        int root = parent[i];
        if(root != parent[root])
            return parent[i] = find(root);
        return root;
    }

    public boolean union(int x, int y){
        int xRoot = parent[x];
        int yRoot = parent[y];
        if(xRoot == yRoot) return false;;
        if(rank[xRoot] > rank[yRoot])
            parent[xRoot] = yRoot;
        else if(rank[xRoot] < rank[yRoot])
            parent[yRoot] = xRoot;
        else {
            parent[xRoot] = yRoot;
            rank[yRoot] = rank[yRoot]+1;
        }
        return true;
    }
}