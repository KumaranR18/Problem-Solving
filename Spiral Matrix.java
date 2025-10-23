Spiral Matrix


Given an m x n matrix, return all elements of the matrix in spiral order.
 

Example 1:

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]


Example 2:

Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 10
-100 <= matrix[i][j] <= 100 



class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        ArrayList<Integer> res = new ArrayList<>();

        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {           // Left to Right
                res.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {           //  Top to Bottom
                res.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {                            //  Still a Bottom Row Left Before Moving Left
                for (int i = right; i >= left; i--) {       //  Right to Left
                    res.add(matrix[bottom][i]); 
                }
                bottom--;
            }

            if (left <= right) {                            //  Still a Left Column Left Before Moving Up
                for (int i = bottom; i >= top; i--) {       //  Bottom to Top
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }

        return res;
    }
}
