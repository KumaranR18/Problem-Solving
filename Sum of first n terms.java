Sum of First n terms

Given an integer n, calculate the sum of series 1^3 + 2^3 + 3^3 + 4^3 + … till n-th term.

Examples:

Input: n = 5
Output: 225
Explanation: 1^3 + 2^3 + 3^3 + 4^3 + 5^3 = 225

Input: n = 7
Output: 784
Explanation: 1^3 + 2^3 + 3^3 + 4^3 + 5^3 + 6^3 + 7^3 = 784


class Solution {
    int sumOfSeries(int n) {
        int sum = 0;
        for (int i=1; i<=n; i++){
            sum += i*i*i;
        }
        return sum;
    }
}



