# ChallengeURL
[LeetCode - Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/solutions/?envType=study-plan-v2&envId=top-interview-150)

## Problem
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
Merge nums1 and nums2 into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

## Intuition
Since I need to change nums1 in place, I need to make sure I do that in such a way that I don't lose data I will need later.
nums1 is padded with zeroes on the end to accomodate the addition of new values, so it makes sense to start at the back end and work towards the front.
I don't need the initial values of m or n so I can use them directly as pointers to their respective arrays.

## Approach
1. Decrement both n and m to point at the last elements in their respective arrays
2. Use a while loop to track when I have used all elements from one of the lists
   - Note that line 6 is doing a lot of heavy lifting
3. First the ternary operator compares the values nums1[m] & nums2[n]
4. If nums1[m] is larger, that value is stored in nums1[n+m+1] and m is decremented
5. Else nums2[n] is stored and n is decremented
6. Once all elements from either list are used, comparisons are no longer necesary
 - Lines 8 and 9 place any unsued elements from nums2 into nums1
 - Going through the rest of nums1 is unnecessary since it already contains all remaining items sorted into their correct places

## Complexity
   - Time Complexity: O(m+n) due to iterating through both arrays
   - Space Complexity: O(1) since only constant amount of additional memory is used
