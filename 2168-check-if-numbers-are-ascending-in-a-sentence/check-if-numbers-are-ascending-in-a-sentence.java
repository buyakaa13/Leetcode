class Solution {
    public boolean areNumbersAscending(String s) {
        if(s.isEmpty())
            return false;
        int element = Integer.MIN_VALUE;
        for(String str: s.split(" ")){
            try {
                int number = Integer.parseInt(str);
                if(number <= element)
                    return false;
                element = number;
            } catch(NumberFormatException e){}
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