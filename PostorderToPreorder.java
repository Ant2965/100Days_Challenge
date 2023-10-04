import java.util.Stack;

class TreeNode {
    char data;
    TreeNode left;
    TreeNode right;

    public TreeNode(char data) {
        this.data = data;
        left = right = null;
    }
}

public class PostorderToPreorder {
    static int postIndex;

    public static TreeNode buildTree(String postorder) {
        postIndex = postorder.length() - 1;
        return buildTreeUtil(postorder.toCharArray(), 0, postorder.length() - 1);
    }

    public static TreeNode buildTreeUtil(char[] postorder, int start, int end) {
        if (start > end)
            return null;

        TreeNode node = new TreeNode(postorder[postIndex]);
        postIndex--;

        if (start == end)
            return node;

        int index = search(postorder, node.data, end);

        node.right = buildTreeUtil(postorder, index + 1, end);
        node.left = buildTreeUtil(postorder, start, index - 1);

        return node;
    }

    public static int search(char[] inorder, char target, int end) {
        for (int i = end; i >= 0; i--) {
            if (inorder[i] == target)
                return i;
        }
        return -1;
    }

    public static String preorderTraversal(TreeNode root) {
        if (root == null)
            return "";

        StringBuilder result = new StringBuilder();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            result.append(current.data);

            if (current.right != null)
                stack.push(current.right);

            if (current.left != null)
                stack.push(current.left);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String postorder = "ABCDEF";
        TreeNode root = buildTree(postorder);
        String preorder = preorderTraversal(root);
        System.out.println("Preorder traversal: " + preorder);
    }
}
