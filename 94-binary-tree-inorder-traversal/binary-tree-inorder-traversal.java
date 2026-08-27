class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> li = new ArrayList<>();

        inorder(root, li);

        return li;
    }

    // LEFT → ROOT → RIGHT
    public void inorder(TreeNode root, List<Integer> li) {

        // Base case
        if (root == null) {
            return;
        }

        // 1. LEFT
        inorder(root.left, li);

        // 2. ROOT
        li.add(root.val);

        // 3. RIGHT
        inorder(root.right, li);
    }
}