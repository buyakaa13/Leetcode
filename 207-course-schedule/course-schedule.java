class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjList = new ArrayList<>();
        int[] inDegree = new int[numCourses];
        for(int i=0; i<numCourses; i++)
            adjList.add(new ArrayList<>());

        for(int i=0; i<prerequisites.length; i++){
            int course = prerequisites[i][0];
            int prerequisite = prerequisites[i][1];
            inDegree[course]++;
            adjList.get(prerequisite).add(course);
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<numCourses; i++){
            if(inDegree[i] == 0)
                queue.add(i);
        }

        List<Integer> result = new ArrayList<>();
        while(!queue.isEmpty()){
            int current = queue.poll();
            result.add(current);
            for(int nextCourse: adjList.get(current)){
                inDegree[nextCourse]--;
                if(inDegree[nextCourse] == 0)
                    queue.add(nextCourse);
            }
        }
        return result.size() == numCourses;
    }
}