class Solution {
    public String addStrings(String num1, String num2) {
        if(num1.equals("0") && num2.equals("0"))
            return "0";
        int n1 = num1.length();
        int m1 = num2.length();
        int n = Math.max(n1, m1);

        StringBuilder sb1 = new StringBuilder(num1);
        StringBuilder sb2 = new StringBuilder(num2);
        sb1.reverse();
        sb2.reverse();

        int[] result = new int[n+1];
        for(int i=0; i<n; i++){
            int number1 = n1 <= i ? 0 : (sb1.charAt(i) - '0');
            int number2 = m1 <= i ? 0 : (sb2.charAt(i) - '0');
            int product = (number1 + number2);
            int sum = product + result[i];
            result[i] = sum % 10;
            result[i+1] = sum / 10;
        }

        StringBuilder sb = new StringBuilder();
        for(int i=result.length-1; i>=0; i--){
            if(!(sb.length() == 0 && result[i] == 0))
                sb.append(result[i]);
        }
        return sb.toString();
    }
}