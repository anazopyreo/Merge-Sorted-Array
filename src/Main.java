import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

//    Example1:
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int[] example1 = {1,2,2,3,5,6};
        solution.merge(nums1, nums1.length - nums2.length, nums2, nums2.length);
        System.out.println(Arrays.equals(nums1,example1));

//    Example2:
        int[] nums3 = {1};
        int[] nums4 = {};
        int[] example2 = {1};
        solution.merge(nums3, nums3.length - nums4.length, nums4, nums4.length);
        System.out.println(Arrays.equals(nums3,example2));

//    Example3:
        int[] nums5 = {0};
        int[] nums6 = {1};
        int[] example3 = {1};
        solution.merge(nums5, nums5.length - nums6.length, nums6, nums6.length);
        System.out.println(Arrays.equals(nums5,example3));
    }
}