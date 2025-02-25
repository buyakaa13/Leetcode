class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count = 0, left = 0, right = people.length-1;
        while(left<=right){
            int remain = limit - people[right--];
            count ++;
            if(left <= right && remain >= people[left])
                left++;
        }
        return count;
    }
}