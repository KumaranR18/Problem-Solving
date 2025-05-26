First and Second Smallests

Given an array, arr of integers, your task is to return the smallest and second smallest element in the array. If the smallest and second smallest do not exist, return -1.

Examples:

Input: arr[] = [2, 4, 3, 5, 6]
Output: 2 3 
Explanation: 2 and 3 are respectively the smallest and second smallest elements in the array.

Input: arr[] = [1, 1, 1]
Output: -1
Explanation: Only element is 1 which is smallest, so there is no second smallest element.


class Solution {
    public int[] minAnd2ndMin(int arr[]) {
        int firstsmallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < firstsmallest) {
                secondsmallest = firstsmallest;
                firstsmallest = num;
            } else if (num < secondsmallest && num != firstsmallest) {
                secondsmallest = num;
            }
        }
        if (secondsmallest == Integer.MAX_VALUE) {
            return new int[]{-1};
        }
        return new int[]{firstsmallest, secondsmallest};
    }
}



