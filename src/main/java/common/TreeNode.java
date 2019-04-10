package common;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }


    public String toString() {
        return Integer.toString(this.val);
    }

    public static List<Integer> unconstructTreeNodeList(TreeNode root) {
        if (root == null) {
            return null;
        }
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> rtn = new ArrayList<>();

        q.add(root);

        while (!q.isEmpty()) {
            TreeNode n = q.poll();
            if (n == null) {
                rtn.add(null);
            } else {
                rtn.add(n.val);
                q.add(n.left);
                q.add(n.right);
            }
        }

        int rtnLen=rtn.size();
        int i=rtnLen-1;
        int count=0;
        while(rtn.get(i)==null){
            count++;
            i--;
        }
        rtn=rtn.subList(0,rtnLen-count);
        return rtn;
    }




}
