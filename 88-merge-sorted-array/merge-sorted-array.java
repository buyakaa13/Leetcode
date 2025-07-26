class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int n1idx = m-1;
        int n2idx = n-1;
        int idx = m+n-1;
        while(n2idx >= 0){
            if(n1idx >= 0 && nums1[n1idx] > nums2[n2idx])
                nums1[idx--] = nums1[n1idx--];
            else
                nums1[idx--] = nums2[n2idx--]; 
        }
    }
}