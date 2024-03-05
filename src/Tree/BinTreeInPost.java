package Tree;
// https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/description/?envType=study-plan-v2&envId=top-interview-150

import java.util.Arrays;

class BinTreeInPost {
    public static void main(String[] args) {
        BinTreeInPost obj = new BinTreeInPost();
        int[] inorder = { 9, 3, 15, 20, 7 };
        int[] postorder = { 9, 15, 7, 20, 3 };
        obj.buildTree(inorder, postorder);
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (postorder.length == 0 || inorder.length == 0)
            return null;
        TreeNode root = new TreeNode(postorder[postorder.length - 1]);
        int index = -1;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == postorder[postorder.length - 1]) {
                index = i;
                break;
            }
        }
        root.left = buildTree(Arrays.copyOfRange(inorder, 0, index), Arrays.copyOfRange(postorder, 0, index));
        root.right = buildTree(
                Arrays.copyOfRange(inorder, index + 1, inorder.length),
                Arrays.copyOfRange(postorder, index, postorder.length - 1));

        return root;
    }
}