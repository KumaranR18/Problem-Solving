Spiral Matrix II


Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.
 

Example 1:

Input: n = 3
Output: [[1,2,3],[8,9,4],[7,6,5]]


Example 2:

Input: n = 1
Output: [[1]]
 

Constraints:

1 <= n <= 20



class Solution {
    public int[][] generateMatrix(int n) {

        int data = 1;
        int[][] db = new int[n][n];

        int top = 0, bottom = n - 1, left = 0, right = n - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {                 // Left to Right
                db[top][i] = data++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {                // Top to Bottom
                db[i][right] = data++;
            }
            right--;

            for (int i = right; i >= left; i--) {               // Right to Left
                db[bottom][i] = data++;
            }
            bottom--;

            for (int i = bottom; i >= top; i--) {              // Bottom to Top 
                db[i][left] = data++;
            }
            left++;

        }
        return db;
    }
}
