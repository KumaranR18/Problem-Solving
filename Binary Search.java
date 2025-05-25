Binary Search

Given a sorted array arr and an integer k, find the position(0-based indexing) at which k is present in the array using binary search.

Note: If multiple occurrences are there, please return the smallest index.

Examples:

Input: arr[] = [1, 2, 3, 4, 5], k = 4
Output: 3
Explanation: 4 appears at index 3.

Input: arr[] = [11, 22, 33, 44, 55], k = 445
Output: -1
Explanation: 445 is not present.

Input: arr[] = [1, 1, 1, 1, 2], k = 1
Output: 0
Explanation: 1 appears at index 0.

Input: arr[] = [1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5], k = 3
Output: 5
Explanation: The first occurrence of 3 is at index 5.


class Solution {
    public int binarysearch(int[] arr, int k) {
        int low = 0, mid, high = arr.length - 1, result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == k) {
                result = mid;
                high = mid - 1;
            } else if (arr[mid] > k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
}

