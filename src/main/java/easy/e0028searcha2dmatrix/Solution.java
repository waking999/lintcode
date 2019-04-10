package easy.e0028searcha2dmatrix;

public class Solution {
    /**
     * @param matrix: matrix, a list of lists of integers
     * @param target: An integer
     * @return a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {

        // write your code here
        int r = matrix.length;
        if (r == 0) {
            return false;
        }

        int c = matrix[0].length;
        if (c == 0) {
            return false;
        }
        if (target < matrix[0][0] || target > matrix[r - 1][c - 1]) {
            return false;
        }

        int pos = findFirstFirstElementOfEachRowLargerThanTarget(matrix, target, 0, r - 1);

        if (found >0) {
            return true;
        }
        found = 0;
        findTarget(matrix, pos - 1, target, 0, c - 1);
        return (found > 0);


    }

    private int found; //0:init; 1:found; -1: not found

    private int findFirstFirstElementOfEachRowLargerThanTarget(int[][] matrix, int target, int t, int b) {
        while (t < b) {
            int m = t + (b - t) / 2;
            if (matrix[m][0] == target) {
                found = 1;
                return m;
            } else if (matrix[m][0] > target) {
                b = m;
            } else {
                t = m + 1;
            }
        }
        if (matrix[b][0] == target) {
            found = 1;
            return b;
        }
        if (matrix[b][0] > target) {
            return b;
        }

        return b+1;
    }

    private int findTarget(int[][] matrix, int row, int target, int l, int r) {
        while (l < r) {
            int m = l + (r - l) / 2;
            if (matrix[row][m] == target) {
                found = 1;
                return m;
            } else if (matrix[row][m] > target) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        if (matrix[row][r] == target) {
            found = 1;
            return r;
        }
        found = -1;
        return -1;
    }
}
