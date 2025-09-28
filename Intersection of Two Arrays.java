Intersection of Two Arrays

Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.


Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]


Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
 

Constraints:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000


class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        HashSet<Integer> result = new HashSet<>();
        int left = 0, right = 0;

        while (left < nums1.length && right < nums2.length) {
            if (nums1[left] == nums2[right]) {
                result.add(nums1[left]);
                left++;
                right++;
            } else if (nums1[left] < nums2[right]) {
                left++;
            } else {
                right++;
            }
        }

        int[] ans = new int[result.size()];
        int i = 0;
        for (int num : result) {
            ans[i++] = num;
        }
        return ans;
    }
}
