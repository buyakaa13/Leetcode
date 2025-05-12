class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjList = new ArrayList<>();
        int[] inDegree = new int[numCourses];
        for(int i=0; i<numCourses; i++){
            adjList.add(new ArrayList<>());
        }

        for(int[] prerequisite: prerequisites){
            int course = prerequisite[0];
            int prereq = prerequisite[1];
            adjList.get(prereq).add(course);
            inDegree[course]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<numCourses; i++){
            if(inDegree[i] == 0)
                queue.add(i);
        }

        int[] result = new int[numCourses];
        int index = 0;
        while(!queue.isEmpty()){
            int current = queue.poll();
            result[index] = current;
            for(int nextCourse: adjList.get(current)){
                inDegree[nextCourse]--;
                if(inDegree[nextCourse] == 0)
                    queue.add(nextCourse);
            }
            index++;
        }
        return index == numCourses ? result : new int[]{};
    }
}