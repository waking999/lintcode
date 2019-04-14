package easy.e0376binarytreepathsum;

import common.NormalBinaryTreeNode;
import common.TreeNode;
import common.VerifyUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BinaryTreePathSumTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        Integer[] nodes;
        TreeNode root;
        int target;
        int[][] expect;
        List<List<Integer>> output;
        int seq=1;

        nodes=new Integer[]{1,2,4,2,3};
        root= NormalBinaryTreeNode.constructTreeNode(nodes);
        target=5;
        expect=new int[][]{{1, 2, 2},{1, 4}};
        output=s.binaryTreePathSum(root,target);
        VerifyUtil.verifyUnsort(expect,output,seq++);

    }
}
