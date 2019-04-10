package easy.e0028searcha2dmatrix;


import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class Searcha2DMatrixTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        int[][] matrix;
        int target;
        boolean expect;
        boolean output;
        int seq = 1;

        matrix = new int[][]{
                {1, 4, 5}, {6, 7, 8}
        };
        target = 6;
        expect = true;
        output = s.searchMatrix(matrix, target);
        VerifyUtil.verify(expect, output, seq++);

        matrix = new int[][]{
                {1, 4, 5}, {6, 7, 8}
        };
        target = 8;
        expect = true;
        output = s.searchMatrix(matrix, target);
        VerifyUtil.verify(expect, output, seq++);
    }

}
