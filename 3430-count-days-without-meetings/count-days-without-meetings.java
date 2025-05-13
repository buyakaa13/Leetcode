class Solution {
    public int countDays(int days, int[][] meetings) {
        //1-3, 5-7, 9-10
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));
        int dayOff = 0, endDay = 0;
        for(int[] meeting: meetings){
            int start = meeting[0], end = meeting[1];
            if(start > endDay+1)
                dayOff += start-endDay-1;
            endDay = Math.max(end, endDay);
        }
        dayOff += days - endDay;
        return dayOff;
    }
}