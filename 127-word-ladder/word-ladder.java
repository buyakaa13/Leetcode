class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(beginWord.equals(endWord)) return 1;
        else if(!wordList.contains(endWord)) return 0;
        Queue<String> queue = new ArrayDeque<>();
        Set<String> set = new HashSet<>(wordList);
        queue.offer(beginWord);
        set.remove(beginWord);
        int count = 1;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i<size; i++){
                String current = queue.poll();
                if(current.equals(endWord)) return count;
                for(int j=0; j<current.length(); j++){
                    char[] chars = current.toCharArray();
                    for(char c='a'; c<='z'; c++){
                        if(c == chars[j]) continue;
                        chars[j] = c;
                        String neighbor = new String(chars);
                        if(set.contains(neighbor)){
                            queue.offer(neighbor);
                            set.remove(neighbor);
                        }
                    }
                }
            }
            count++;
        }
        return 0;
    }
}