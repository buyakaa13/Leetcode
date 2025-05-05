class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjList = new ArrayList<>();
        int[] inDegree = new int[numCourses];
        
        for (int i = 0; i < numCourses; i++)
            adjList.add(new ArrayList<>());
        
        for (int[] prereq : prerequisites) {
            int course = prereq[0]; 
            int prerequisite = prereq[1]; 
            adjList.get(prerequisite).add(course);
            inDegree[course]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<numCourses; i++){
            if(inDegree[i] == 0)
                queue.add(i);
        }

        List<Integer> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            int currentCourse = queue.poll();
            result.add(currentCourse);

            for (int nextCourse : adjList.get(currentCourse)) {
                inDegree[nextCourse]--;
                if (inDegree[nextCourse] == 0) {
                    queue.offer(nextCourse);
                }
            }
        }
        return result.size() == numCourses;
    }
}