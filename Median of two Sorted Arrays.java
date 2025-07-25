Median of two Sorted Arrays

Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).


Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.


Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.


class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] res = new int[len1 + len2];
        for (int i = 0; i < len1; i++) {
            res[i] = nums1[i];
        }
        for (int i = 0; i < len2; i++) {
            res[len1 + i] = nums2[i];
        }
        Arrays.sort(res);
        int n = res.length;
        if (n % 2 == 0) {
            return (res[(n / 2) - 1] + res[n / 2]) / 2.0;
        }
        return res[n / 2];
    }
}



