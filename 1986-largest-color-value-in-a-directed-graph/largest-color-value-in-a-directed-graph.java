class Solution {
    public int largestPathValue(String colors, int[][] edges) {
        int n = colors.length();
        List<List<Integer>> graph = new ArrayList<>();
        int[] indegree = new int[n];

        for (int i = 0; i < n; i++) 
            graph.add(new ArrayList<>());
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            indegree[edge[1]]++;
        }

        int[][] count = new int[n][26];
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) queue.add(i);
            count[i][colors.charAt(i) - 'a'] = 1;
        }

        int visited = 0;
        int maxCount = 0;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            visited++;
            for (int neighbor : graph.get(node)) {
                for (int i = 0; i < 26; i++) {
                    int curr = count[node][i] + (colors.charAt(neighbor) - 'a' == i ? 1 : 0);
                    count[neighbor][i] = Math.max(count[neighbor][i], curr);
                }
                indegree[neighbor]--;
                if (indegree[neighbor] == 0) queue.offer(neighbor);
            }
            maxCount = Math.max(maxCount, Arrays.stream(count[node]).max().getAsInt());
        }
        return visited == n ? maxCount : -1;
    }
}