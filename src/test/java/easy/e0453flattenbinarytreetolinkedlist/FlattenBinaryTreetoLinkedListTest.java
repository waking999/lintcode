package easy.e0453flattenbinarytreetolinkedlist;

import common.NormalBinaryTreeNode;
import common.TreeNode;
import common.VerifyUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FlattenBinaryTreetoLinkedListTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        Integer[] nodes;
        TreeNode root;
        Integer[] expect;
        List<Integer> output;
        int seq=1;

        nodes=new Integer[]{1,2,5,3,4,null,6};
        root= NormalBinaryTreeNode.constructTreeNode(nodes);
        s.flatten(root);
        expect=new Integer[]{1,null,2,null,3,null,4,null,5,null,6};
        output=TreeNode.unconstructTreeNodeList(root);
        VerifyUtil.verifyUnsort(expect,output,seq++);

    }
}
