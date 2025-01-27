class Solution {
    public String discountPrices(String sentence, int discount) {
        if(sentence.isEmpty()) return "";
        String[] strArray = sentence.split(" ");
        StringBuilder newArray = new StringBuilder();
        for(String s: strArray){
            if(s.startsWith("$") && !s.endsWith("$")) {
                int count = 0;
                for(char c: s.toCharArray()){
                    if(!Character.isDigit(c))
                        count++;
                }
                if(count == 1){
                    double amount = Double.parseDouble(s.substring(1));
                    amount -= amount / 100 * discount;
                    newArray.append(" $" + String.format("%.2f", amount));
                }
                else
                    newArray.append(" " + s);
            }
            else
                newArray.append(" " + s);
        }
        return newArray.substring(1);
    }
}