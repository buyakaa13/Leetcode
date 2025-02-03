class Solution {
    public boolean areNumbersAscending(String s) {
        if(s.isEmpty())
            return false;
        String[] array = s.split(" ");
        int element = Integer.MIN_VALUE;
        for(String a: array){
            if(isNumeric(a) && Integer.parseInt(a) > element)
                element = Integer.parseInt(a);
            else if(isNumeric(a) && Integer.parseInt(a) <= element)
                return false;
        }
        return true;
    }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}