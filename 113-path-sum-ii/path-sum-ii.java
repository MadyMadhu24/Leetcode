/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.*;

class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(root, targetSum, new ArrayList<>(), ans);
        return ans;
    }

    private void dfs(TreeNode node, int sum,
                     List<Integer> path,
                     List<List<Integer>> ans) {

        if (node == null) return;

        path.add(node.val);

        // Leaf node
        if (node.left == null && node.right == null && sum == node.val) {
            ans.add(new ArrayList<>(path));
        } else {
            dfs(node.left, sum - node.val, path, ans);
            dfs(node.right, sum - node.val, path, ans);
        }

        // Backtrack
        path.remove(path.size() - 1);
    }
}