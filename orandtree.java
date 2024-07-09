/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
// class Solution {
// public boolean evaluateTree(TreeNode root) {
// if (root.left == null && root.right == null) {
// return root.val == 1; // Leaf nodes: 0 represents false, 1 represents true
// }

// boolean leftValue = evaluateTree(root.left);
// boolean rightValue = evaluateTree(root.right);

// if (root.val == 2) {
// return leftValue || rightValue; // OR operation
// } else if (root.val == 3) {
// return leftValue && rightValue; // AND operation
// }

// // Invalid node value (should not happen in a valid tree as per the problem
// constraints)
// throw new IllegalArgumentException("Invalid node value: " + root.val);
hghdff
h
// }

class Solution {
    public boolean evaluateTree(TreeNode root) {
        if (root.left == null && root.right == null) {
            return root.val != 0; // Convert int to boolean
        }

        if (root.val == 2) {
            return evaluateTree(root.left) | evaluateTree(root.right);
        }

        return evaluateTree(root.left) & evaluateTree(root.right);
    }
}

nerjtnrejtnej

nerjtnrejtnej

nerjtnrejtnej