class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m--;
        n--;
        while(m > -1 && n > -1){
            nums1[n+m+1] = nums1[m] > nums2[n]? nums1[m--] : nums2[n--];
        }
        while(n > -1){
            nums1[n] = nums2[n--];
        }
    }
}