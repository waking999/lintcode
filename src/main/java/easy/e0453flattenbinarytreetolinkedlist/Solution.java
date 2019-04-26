package easy.e0453flattenbinarytreetolinkedlist;

import common.TreeNode;

public class Solution {
    public void flatten(TreeNode root) {
        // write your code here
        helper(root);
    }

    private void helper(TreeNode node) {
        if (node == null) {
            return;
        }
        if (node.right != null) {
            if (node.left != null) {
                TreeNode p = node.left;
                while (p.right != null) {
                    p = p.right;
                }
                p.right = node.right;
                node.right = node.left;
                node.left = null;
            }
        }else{
            node.right=node.left;
            node.left=null;
        }


        helper(node.right);
    }
}
