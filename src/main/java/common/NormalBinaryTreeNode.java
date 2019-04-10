package common;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class NormalBinaryTreeNode extends TreeNode {



    public NormalBinaryTreeNode(int x) {
        super(x);
    }


    public static TreeNode constructTreeNode(Integer[] nodes) {
        int nodesLen = nodes.length;
        if (nodesLen == 0) {
            return null;
        }
        TreeNode root = new TreeNode(nodes[0]);

        Queue<TreeNode> parent = new LinkedList<>();
        parent.add(root);
        for (int i = 1; i < nodesLen; i++) {
            TreeNode c = null;
            if (i % 2 != 0) {
                if (nodes[i] != null) {
                    c = new TreeNode(nodes[i]);
                    parent.add(c);
                    TreeNode t = parent.peek();
                    assert t != null;
                    t.left = c;
                }
            } else {
                if (nodes[i] != null) {
                    c = new TreeNode(nodes[i]);
                    parent.add(c);
                    TreeNode t = parent.poll();
                    assert t != null;
                    t.right = c;
                } else {
                    parent.poll();
                }
            }


        }

        return root;
    }

    private static TreeNode targetNode;
    public static TreeNode findNode(TreeNode root, int targetVal) {
        targetNode = null;
        findNodeHelper(root, targetVal);
        return targetNode;
    }
    private static void findNodeHelper(TreeNode node, int targetVal) {
        if (node == null) {
            return;
        }
        if (node.val == targetVal) {
            targetNode = node;
            return;
        }
        if (targetNode == null) {
            findNodeHelper(node.left, targetVal);
        }
        if (targetNode == null) {
            findNodeHelper(node.right, targetVal);
        }

    }

}