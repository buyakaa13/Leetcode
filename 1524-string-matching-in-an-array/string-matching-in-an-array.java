class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();
        if(words.length == 0)
            return list;
        for(String str: words){
            for (String s: words){
                if(!str.equals(s) && str.contains(s) && !list.contains(s))
                    list.add(s);
            }
        }
        return list;
    }
}