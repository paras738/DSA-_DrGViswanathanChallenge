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
class Solution {

    public TreeNode sortedArrayToBST(int[] arr) {

        // Call the recursive function on the entire array
        return makeTree(arr, 0, arr.length - 1);
    }

    public TreeNode makeTree(int[] arr, int start, int end) {

        // Base Case
        // If there are no elements left, return null
        if (start > end) {
            return null;
        }

        // Find the middle element
        int mid = start + (end - start) / 2;

        // Create the root node using the middle element
        TreeNode root = new TreeNode(arr[mid]);

        // Build the left subtree
        root.left = makeTree(arr, start, mid - 1);

        // Build the right subtree
        root.right = makeTree(arr, mid + 1, end);

        // Return the root of this subtree
        return root;
    }
}