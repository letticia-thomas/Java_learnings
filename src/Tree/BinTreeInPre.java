package Tree;
// https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/?envType=study-plan-v2&envId=top-interview-150
// Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree and inorder is the inorder traversal of the same tree, construct and return the binary tree.
import java.util.Arrays;

class BinTreeInPre {
    public static void main(String[] args) {
        BinTreeInPre obj = new BinTreeInPre();
        int[] inorder = { 9, 3, 15, 20, 7 };
        int[] preorder = { 3, 9, 20, 15, 7 };
        obj.buildTree(preorder, inorder);
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0)
            return null;
        TreeNode root = new TreeNode(preorder[0]);
        int index = -1;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == preorder[0])
                index = i;
        }
        root.left = buildTree(Arrays.copyOfRange(preorder, 1, index + 1), Arrays.copyOfRange(inorder, 0, index));
        root.right = buildTree(Arrays.copyOfRange(preorder, index + 1, preorder.length),
                Arrays.copyOfRange(inorder, index + 1, inorder.length));
        return root;
    }
}
