Minimum Size Subarray Sum

Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.


Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.

Example 2:

Input: target = 4, nums = [1,4,4]
Output: 1

Example 3:

Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0


class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0, currentSum = 0;
        int minLenWindow = Integer.MAX_VALUE;

        for (int high = 0; high < nums.length; high++) {
            currentSum += nums[high];

            while (currentSum >= target) {
                int currentWindow = high - low + 1;
                minLenWindow = Math.min(minLenWindow, currentWindow);
                currentSum -= nums[low];
                low++;
            }
        }

        return minLenWindow == Integer.MAX_VALUE ? 0 : minLenWindow;
    }
}


