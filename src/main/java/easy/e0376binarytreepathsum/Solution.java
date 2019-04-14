package easy.e0376binarytreepathsum;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /*
     * @param root: the root of binary tree
     * @param target: An integer
     * @return: all valid paths
     */
    public List<List<Integer>> binaryTreePathSum(TreeNode root, int target) {
        // write your code here
        List<List<Integer>> paths=new ArrayList<>();
        int[] path=new int[100];
        dfs(root,target,0,paths,0,path);
        return paths;
    }

    private void dfs(TreeNode node, int target, int sum, List<List<Integer>> paths, int level, int[] path){
        if(node==null){
            return;
        }

        sum+=node.val;
        path[level]=node.val;

        if(node.left==null&&node.right==null){
            if(sum==target){
                List<Integer> tmp=new ArrayList<>();
                for(int i=0;i<=level;i++){
                    tmp.add(path[i]);
                }
                paths.add(tmp);
            }
            return;
        }
        if(node.left!=null){
            dfs(node.left,target,sum,paths,level+1,path);
        }
        if(node.right!=null){
            dfs(node.right,target,sum,paths,level+1,path);
        }




    }
}
