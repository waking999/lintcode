package medium.m0374spiralmatrix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (isNullOrEmpty(matrix)) return Collections.emptyList();
        int rows = matrix.length;
        int cols = matrix[0].length;
        List<Integer> elements = new ArrayList<>(rows * cols);
        for (int row = 0, col = -1; true; ) {
            for (int c = 0; c < cols; c++) {
                elements.add(matrix[row][++col]);
            }
            if (--rows == 0) break;
            for (int r = 0; r < rows; r++) {
                elements.add(matrix[++row][col]);
            }
            if (--cols == 0) break;
            for (int c = 0; c < cols; c++) {
                elements.add(matrix[row][--col]);
            }
            if (--rows == 0) break;
            for (int r = 0; r < rows; r++) {
                elements.add(matrix[--row][col]);
            }
            if (--cols == 0) break;
        }
        return elements;
    }

    private boolean isNullOrEmpty(int[][] matrix) {
        return matrix == null || matrix.length == 0 || matrix[0].length == 0;
    }
}
