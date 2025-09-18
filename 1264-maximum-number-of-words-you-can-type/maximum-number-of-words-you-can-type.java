class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] textArray = text.split(" ");
        Set<Character> broken = new HashSet<>();
        for(char c: brokenLetters.toCharArray())
            broken.add(c);
        int count = 0;
        for(String t: textArray){
            for(char c: t.toCharArray()){
                if(broken.contains(c)){
                    count++;
                    break;
                }
            }
        }
        return textArray.length - count;
            
    }
}